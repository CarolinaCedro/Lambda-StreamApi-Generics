package Generics;

public class Generics<T> {

    private T nome;
    private T valor;

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
