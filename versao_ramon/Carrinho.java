import java.util.List;
import java.util.UUID;

public class Carrinho {
    private final UUID id;
    private final List<Item> itens;

    public Carrinho(List<Item> itens) {
        this.id = UUID.randomUUID();
        this.itens = itens;
    }

    public UUID getId() {
        return id;
    }

    public List<Item> getItens() {
        return itens;
    }
}
