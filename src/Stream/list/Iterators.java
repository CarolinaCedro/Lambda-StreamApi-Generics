package Stream.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {

        List<String> Filmes = Arrays.asList("Efeito Borboleta", "Matrix", "Star wars", "De volta para o futuro");

        System.out.println("Filmes");
        Iterator<String> nomesFilmes = Filmes.iterator();
        while (nomesFilmes.hasNext()){
            System.out.println(nomesFilmes.next());
        }

    }
}
