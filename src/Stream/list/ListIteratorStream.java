package Stream.list;

//formas de fazer um laço de repetição desde a forma mais comum até utilizando Stream Api

import Lambda.foreach.Foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListIteratorStream {
    public static void main(String[] args) {

        List<String> pessoas = Arrays.asList("Ana", "Jão", "Matheus", "Marcelo");

        //1 For na sua essencia crua

        System.out.println("For normal");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }

        // 2 forma com forEach

        System.out.println("\nFor melhorado (FOREACH");
        for (String lista : pessoas
        ) {
            System.out.println(lista);
        }

        //Forma com iterator
        System.out.println("\nCom Iterator");
        Iterator<String> iterator = pessoas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Forma com Streamm
        System.out.println("\nCom Stream");
        Stream<String> lista = pessoas.stream();
        lista.forEach(System.out::println);

    }
}
