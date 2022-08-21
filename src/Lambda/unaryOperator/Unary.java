package Lambda.unaryOperator;

import java.util.function.UnaryOperator;

public class Unary {

    public static void main(String[] args) {
        UnaryOperator<Integer> soma2 = s -> s + 2;
        UnaryOperator<Integer> multiplica2 = s -> s * 2;
        UnaryOperator<Integer> divide2 = s -> s / 2;

        System.out.println(soma2.andThen(multiplica2).andThen(divide2).apply(10));
    }
}
