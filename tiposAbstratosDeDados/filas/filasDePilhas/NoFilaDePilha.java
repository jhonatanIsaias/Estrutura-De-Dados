package tiposAbstratosDeDados.filas.filasDePilhas;

import tiposAbstratosDeDados.Pilhas.pilhaEncadeada.PilhaEncadeada;
import tiposAbstratosDeDados.filas.No;

public class NoFilaDePilha<T> {
    private PilhaEncadeada<T> pilha;
    private No prox;


    public PilhaEncadeada<T> getPilha() {
        return pilha;
    }

    public void setPilha(PilhaEncadeada<T> pilha) {
        this.pilha = pilha;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
