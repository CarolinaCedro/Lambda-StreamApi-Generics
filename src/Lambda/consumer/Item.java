package Lambda.consumer;

public class Item {
    final String nome;
    final  Double price;

    public Item(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }
}
