package Lambda.function;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parImpar = p -> p % 2 == 0 ? "Par" : "Impar";
        String resultado = parImpar.apply(8);
        System.out.println(resultado);

        Function<String,String> text = t -> "Este é um valor";

        String resultadofinal = parImpar.andThen(text).apply(32);
        System.out.println(resultadofinal);
    }
}
