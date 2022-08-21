package Lambda.predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {


        Predicate<Integer> par = p -> p % 2 != 0;

        Predicate<Integer> quatro = q -> q == 4;

        System.out.println(par.or(quatro).test(3));

    }
}
