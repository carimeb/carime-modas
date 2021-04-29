import java.math.BigDecimal;

public class CalculoDaCompra {
    private BigDecimal total;
    private BigDecimal totalComDesconto;
    private String cupomNome;
    private BigDecimal desconto;

    public CalculoDaCompra(BigDecimal total, BigDecimal desconto, BigDecimal totalComDesconto, String cupomNome) {
        this.total = total;
        this.desconto = desconto;
        this.totalComDesconto = totalComDesconto;
        this.cupomNome = cupomNome;
    }

    @Override
    public String toString() {
        return "Calculo Da Compra {\n" +
                " ==> Total= " + total +
                ", \n ==> Total Com Desconto= " + totalComDesconto +
                ", \n ==> Desconto= " + desconto +
                ", \n ==> Nome Do Cupom= '" + cupomNome + '\'' +
                "\n}";
    }
}
