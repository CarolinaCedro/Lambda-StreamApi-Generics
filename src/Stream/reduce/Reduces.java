package Stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduces {

    public static void main(String[] args) {

        List<Integer> somaList = Arrays.asList(1,1,1,1,1,1,1,1,1);

        BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador+numero;
        Integer somaReduce = somaList.stream().reduce(0,soma);

        System.out.println(somaReduce);

    }

}
