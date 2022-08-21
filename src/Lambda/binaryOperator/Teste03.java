package Lambda.binaryOperator;


//Dentro da api java existe uma lista de interfaces funcionais onde podemos utilizar

import java.util.function.BinaryOperator;

public class Teste03 {
    public static void main(String[] args) {

        //BinaryOPerator Double
        BinaryOperator<Double> calc = (x,y)-> x * y;
        System.out.println(calc.apply(5.0,5.0));

        //BinaryOperator String
        BinaryOperator<String> text = (nome,sobrenome) -> nome + sobrenome;
        System.out.println(text.apply("Ana Carolina"," Cedro"));

        //BinaryOperator Integer
        BinaryOperator<Integer> numerosInteiros = (n1,n2) -> n1 + n2;
        System.out.println(numerosInteiros.apply(5,5));




    }
}
