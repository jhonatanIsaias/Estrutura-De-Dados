package tiposAbstratosDeDados.Listas.listaDuplamenteEncadeada;

public class No<T extends Comparable<T>> {
    private T num;
    private No<T> prox;
    private No<T> anterior;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    public No<T> getProx() {
        return this.prox;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}
