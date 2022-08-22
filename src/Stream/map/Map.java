package Stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        //Pega a stream original e apartir dela cria uma nova stream de acordo com as regras que
        //foram passadas na lambda.
        List<String> cars = Arrays.asList("BMW", "FERRARI", "OPALA");
        cars.stream().map(res -> res + " !").forEach(print);

    }
}
