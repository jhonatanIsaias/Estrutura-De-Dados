package tiposAbstratosDeDados.Pilhas.pilhaEncadeada;

public class No<T>{
    private No dado;
    private No prox;

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    private No ant;

    public No getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = (No) dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
