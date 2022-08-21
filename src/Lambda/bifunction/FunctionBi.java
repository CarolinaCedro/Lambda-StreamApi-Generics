package Lambda.bifunction;

import java.util.function.BiFunction;

public class FunctionBi {

    public static void main(String[] args) {

        BiFunction<Double, Double, String> media = (x, y) -> {
            double med = (x + y) / 2;
            return med >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(media.apply(7.0,6.3));
    }


}
