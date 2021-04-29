import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Principal {

    public static void main(String[] args) {

        Cupom cupom = new Cupom();
        cupom.setId(UUID.randomUUID());
        cupom.setNome("VACAGORDA");
        cupom.setDesconto("0.15");

        Cliente cliente = new Cliente();
        cliente.setNome("Ramón");
        cliente.setCpf("2345678900");
        cliente.setCupom(cupom);

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.setNome("camisa");
        item2.setNome("calça");
        item3.setNome("camiseta");

        item1.setValor(new BigDecimal("50.00"));
        item2.setValor(new BigDecimal("100.00"));
        item3.setValor(new BigDecimal("150.00"));

        List<Item> listaItens = List.of(item1, item2, item3);

        Carrinho carrinho = new Carrinho();
        carrinho.setId(UUID.randomUUID());
        carrinho.setItens(listaItens);

        Calculadora calculadora = new Calculadora();
        CalculoDaCompra calculoDaCompra = calculadora.calcular(cliente, carrinho);
        CalculoDaCompra calculoDaCompra2 = calculadora.calcular(cliente, carrinho); //para garantir que o cupom usado antes não será reutilizado

        System.out.println(calculoDaCompra);
        System.out.println(calculoDaCompra2);

    }
}
