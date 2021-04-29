import java.util.UUID;

public class Cupom {
    private final UUID id;
    private final String nome;
    private final String desconto;

    public Cupom(String nome, String desconto) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.desconto = desconto;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesconto() {
        return desconto;
    }
}
