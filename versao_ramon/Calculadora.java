import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Calculadora {
    List<UUID> cuponsUtilizados = new ArrayList<>();

    public CalculoDaCompra calcular(Cliente cliente, Carrinho carrinho) {
        Cupom cupom = cliente.getCupom();
        BigDecimal desconto = BigDecimal.ZERO;

        BigDecimal total = carrinho.getItens()
                .stream()
                .map(Item::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        if (Objects.nonNull(cupom) && !cupomJaUtilizado(cupom)) {
            desconto = total.multiply(
                    new BigDecimal(cupom.getDesconto())
            ).setScale(2, RoundingMode.CEILING);

            cuponsUtilizados.add(cupom.getId());
        }

        BigDecimal totalComDesconto = total.subtract(desconto);

        return new CalculoDaCompra(total, desconto, totalComDesconto, cupom.getNome());
    }

    private boolean cupomJaUtilizado(Cupom cupom) {
        return cuponsUtilizados.contains(cupom.getId());
    }
}
