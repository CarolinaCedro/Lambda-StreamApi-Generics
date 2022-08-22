package Stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numerosNaturais = numeros.stream();
        numerosNaturais.forEach(System.out::println);
    }
}
