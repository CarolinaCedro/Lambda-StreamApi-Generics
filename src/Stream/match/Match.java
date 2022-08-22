package Stream.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Product p1 = new Product("Chinelo", 35.99);
        Product p2 = new Product("Teclado", 350.00);
        Product p3 = new Product("Camiseta", 100.00);

        List<Product> products = Arrays.asList(p1, p2, p3);
        products.forEach(System.out::println);

        Predicate<Product> caros = (res -> res.preco < 50.0);
        System.out.println(products.stream().allMatch(caros));
        System.out.println(products.stream().anyMatch(caros));
        System.out.println(products.stream().noneMatch(caros));


    }
}
