package Stream.filter;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 8.9);
        Aluno a2 = new Aluno("Marcela", 4.9);
        Aluno a3 = new Aluno("Julia", 6.9);
        Aluno a4 = new Aluno("Joice", 4.9);
        Aluno a5 = new Aluno("Maitê", 6.0);

        List<Aluno> listaAprovados = Arrays.asList(a1, a2, a3, a4, a5);

        System.out.println("Alunos");
        listaAprovados.forEach(System.out::println);

        System.out.println();
        System.out.println("Lista aprovados");
        listaAprovados.stream().filter(res -> res.nota >= 6.0)
                .map(res -> "Parabés " + res.nome + " Você foi aprovado").forEach(System.out::println);


    }
}
