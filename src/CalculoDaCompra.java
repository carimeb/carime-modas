import java.math.BigDecimal;

public class CalculoDaCompra {

    private BigDecimal total;
    private BigDecimal totalComDesconto;
    private String cupomNome;
    private BigDecimal desconto;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalComDesconto() {
        return totalComDesconto;
    }

    public void setTotalComDesconto(BigDecimal totalComDesconto) {
        this.totalComDesconto = totalComDesconto;
    }

    public String getCupomNome() {
        return cupomNome;
    }

    public void setCupomNome(String cupomNome) {
        this.cupomNome = cupomNome;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "CalculoDaCompra{" +
                "total=" + total +
                ", totalComDesconto=" + totalComDesconto +
                ", cupomNome='" + cupomNome + '\'' +
                ", desconto=" + desconto +
                '}';
    }
}
