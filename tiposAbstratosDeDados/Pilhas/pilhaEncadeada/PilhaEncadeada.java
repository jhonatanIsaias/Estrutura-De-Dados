package tiposAbstratosDeDados.Pilhas.pilhaEncadeada;
import tiposAbstratosDeDados.Pilhas.Pilha;
import tiposAbstratosDeDados.Pilhas.PilhaCheiaException;
import tiposAbstratosDeDados.Pilhas.PilhaVaziaException;

public class PilhaEncadeada<T> implements Pilha<T> {

    private No<T> topo;
    private int qtd;
    public PilhaEncadeada(){
        this.topo = null;
        this.qtd = 0;
    }
    @Override
    public void empilhar(T elemento) throws PilhaCheiaException {
        if(this.qtd > 10){
            throw new PilhaCheiaException("pilha cheia");
        }
        No<T> novo = new No();
        novo.setDado(elemento);
        if(this.estaVazia()){
          this.topo = novo;
          this.topo.setAnt(null);

        }else{

          novo.setAnt(this.topo);
          this.topo = novo;
        }
        qtd++;
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        if(this.estaVazia()){
            throw new PilhaVaziaException("fila vazia");
        }

        T dado = (T) this.topo.getDado();
        this.topo = this.topo.getAnt();
        qtd--;
        return dado;

    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        if(this.topo == null){
            throw new PilhaVaziaException("pilha vazia");
        }
        return  this.topo.getDado();
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }

    @Override
    public boolean estaVazia() {
        if(this.topo == null){
            return true;
        }
        return false;
    }
}
