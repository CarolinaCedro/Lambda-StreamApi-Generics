package Lambda.predicate;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Product> isTrue = caro -> (caro.preco > 100.00);

        Product prod = new Product("Celular",70.0);

        System.out.println("Este produto é caro ? "+ isTrue.test(prod));

    }
}
