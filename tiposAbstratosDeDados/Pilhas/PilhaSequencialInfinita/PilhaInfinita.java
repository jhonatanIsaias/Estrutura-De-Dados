package tiposAbstratosDeDados.Pilhas.PilhaSequencialInfinita;

import java.util.Arrays;
import tiposAbstratosDeDados.Pilhas.Pilha;
import tiposAbstratosDeDados.Pilhas.PilhaCheiaException;
import tiposAbstratosDeDados.Pilhas.PilhaVaziaException;

public class PilhaInfinita<T> implements Pilha<T> {

    private T[] vetorSequencial;
    private int fim;
    public PilhaInfinita(Class<T> infoCategoria, int tamanho){
        this.vetorSequencial = (T[]) java.lang.reflect.Array.newInstance(infoCategoria, tamanho);
        this.fim = 0;
    }
    @Override
    public void empilhar(T elemento) throws PilhaCheiaException {

        if(this.getQtd() == vetorSequencial.length - 1){
            this.aumentarPilha(this.vetorSequencial.length);
        }
        this.vetorSequencial[fim] = elemento;
        this.fim++;
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        if(this.estaVazia()){
            throw new PilhaVaziaException("fila vazia");
        }
        T dado = this.getTopo();
        this.vetorSequencial[this.fim -1] = null;
        this.fim--;
        return dado;
    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        if(this.estaVazia()){
            throw new PilhaVaziaException("pilha vazia");
        }
        return this.vetorSequencial[this.fim - 1];
    }

    @Override
    public int getQtd() {
        return this.fim - 1 ;
    }

    @Override
    public boolean estaVazia() {
        if(this.vetorSequencial[0] == null){
            return true;
        }
        return false;
    }

    private void aumentarPilha(int capacidade){
        this.vetorSequencial = Arrays.copyOf(this.vetorSequencial,(2*capacidade));
       //System.arraycopy(this.vetorSequencial,0,this.vetorSequencial,0,2*this.vetorSequencial.length);


    }
}
