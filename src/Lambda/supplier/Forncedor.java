package Lambda.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Forncedor {

    public static void main(String[] args) {

        Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Belo", "Pedro");
        System.out.println(lista.get());
    }
}
