package Generics;

public class Main {

    public static void main(String[] args) {
        Generics<String> generics = new Generics<String>();
        generics.setNome("Teste");
        String result = generics.getNome();
        System.out.println(result);

        //Não deixa pq o tipo não é o que defini no inicio de criação do objeto
//        generics.setNome(345645);

        Generics<Integer> genericsInteiros = new Generics<Integer>();
        //Agora deixa pq o tipo é correspondente
        genericsInteiros.setNome(44444);
    }


}
