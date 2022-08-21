package Lambda.foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        //Tradicional
        System.out.println("Tradicional");
        List<String> alunos = Arrays.asList("Ana", "Matheus", "Vinicius", "Beatriz");
        for (String aprovados : alunos
        ) {
            System.out.println(aprovados);
        }

        //Forma com Lambda 01
        System.out.println("\nForma Lambda 01");
        alunos.forEach((nome)-> System.out.println(nome));

        //forma simplificada de passar sem parenteses;
        alunos.forEach(nome -> System.out.println(nome));

        System.out.println();
        //Rerencia de metodo significa que para cada elemento da minha lista o foreach vai realizar uma ação por meio de referencia.
        System.out.println("Method Referencia");
        alunos.forEach(System.out::println);

        System.out.println();
        System.out.println("Method personalizado com mensagem");

        //Lambda
        System.out.println("Lambda");
        alunos.forEach(msgm -> msg(msgm));

        //Method Referencia
        System.out.println("Methodo referncia");
        alunos.forEach(Foreach::msg);

    }

    //Criar method personalidado para impressão no lambda ou no method Functional
    public static void msg(String mensagem){
        System.out.println("A mensagem do dia: "+mensagem);
    }
}
