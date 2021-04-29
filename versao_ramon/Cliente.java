public class Cliente {
    private final String nome;
    private final String cpf;
    private final Cupom cupom;

    public Cliente(String nome, String cpf, Cupom cupom) {
        this.nome = nome;
        this.cpf = cpf;
        this.cupom = cupom;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cupom getCupom() {
        return cupom;
    }
}
