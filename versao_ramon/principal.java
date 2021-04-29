import java.math.BigDecimal;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        Cupom cupom = new Cupom("Super10", "0.1");

        Cliente cliente = new Cliente(
                "Ramon",
                "01766585566",
                cupom
        );

        List<Item> itens = List.of(
                new Item("Camisa", new BigDecimal("39.90")),
                new Item("Calça", new BigDecimal("50.00")),
                new Item("Cinto", new BigDecimal("15.50"))
        );

        Carrinho carrinho = new Carrinho(itens);

        Calculadora calculadora = new Calculadora();

        CalculoDaCompra calculoDaCompra = calculadora.calcular(cliente, carrinho);
        System.out.println(calculoDaCompra);

        System.out.println("====================");

        CalculoDaCompra calculoDaCompra2 = calculadora.calcular(cliente, carrinho);
        System.out.println(calculoDaCompra2);

    }
}
