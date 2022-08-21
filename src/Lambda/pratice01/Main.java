package Lambda.pratice01;

public class Main {
    public static void main(String[] args) {

        //tipo 1 de retorno
        Calculo calcular = (num1,num2)->{
            return num1 * num2;
        };

        //tipo 2 de retorno
//        Calculo calcular = (num1 ,num2) -> num1 * num2;
        System.out.println(calcular.executar(10,30));
    }
}
