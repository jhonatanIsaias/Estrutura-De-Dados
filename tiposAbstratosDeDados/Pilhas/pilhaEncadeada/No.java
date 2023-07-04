package tiposAbstratosDeDados.Pilhas.pilhaEncadeada;

public class No<T> {
    private T dado;
    private No<T> ant;

    public No getAnt() {
        return ant;
    }

    public void setAnt(No<T> ant) {
        this.ant = ant;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado =  dado;
    }
}

