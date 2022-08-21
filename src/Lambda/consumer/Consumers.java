package Lambda.consumer;


import Lambda.foreach.Foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {


        Consumer<Item> nomeItem = i -> System.out.println(i.nome);

        Item item1 = new Item("Caderno",23.0);
        nomeItem.accept(item1);

        Item item2 = new Item("Moto",12000.0);
        Item item3 = new Item("Bicicleta",12000.0);
        Item item4 = new Item("Patinete",12000.0);
        Item item5 = new Item("Avião",12000.0);
        Item item6 = new Item("Caminhão",12000.0);

        List<Item> items = Arrays.asList(item2,item3,item4,item5,item6);

        items.forEach(nomeItem);
        System.out.println();
        items.forEach(res -> System.out.println(res));
        System.out.println();
        items.forEach(System.out::println);


    }

}
