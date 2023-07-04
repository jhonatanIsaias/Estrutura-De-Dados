package tiposAbstratosDeDados.Pilhas.PilhaSequencial;
import tiposAbstratosDeDados.Pilhas.PilhaVaziaException;
import tiposAbstratosDeDados.Pilhas.PilhaCheiaException;
import tiposAbstratosDeDados.Pilhas.Pilha;
import tiposAbstratosDeDados.Pilhas.PilhaCheiaException;

public class PilhaSequencial<T> implements Pilha<T> {
    private T[] vetorSequencial;
    private int fim;
    public PilhaSequencial(Class<T> infoCategoria, int tamanho){
        this.vetorSequencial = (T[]) java.lang.reflect.Array.newInstance(infoCategoria, tamanho);
        this.fim = 0;
    }
    @Override
    public void empilhar(T elemento) throws PilhaCheiaException {
        if(this.getQtd() == vetorSequencial.length){
           throw new PilhaCheiaException("fila cheia");
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
        return this.fim ;
    }

    @Override
    public boolean estaVazia() {
        if(vetorSequencial[0] == null){
            return true;
        }
        return false;
    }
}
