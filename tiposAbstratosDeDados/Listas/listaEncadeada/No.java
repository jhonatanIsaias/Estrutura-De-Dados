package tiposAbstratosDeDados.Listas.listaEncadeada;

public class No<T extends Comparable<T>>{
    private T num;
    private No<T> prox;

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
        return prox;
    }



}
