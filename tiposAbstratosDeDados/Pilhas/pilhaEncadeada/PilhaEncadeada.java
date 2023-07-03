package tiposAbstratosDeDados.Pilhas.pilhaEncadeada;
import tiposAbstratosDeDados.Pilhas.Pilha;
public class PilhaEncadeada<T> implements Pilha<T> {

    private No fim;
    private int qtd;
    public PilhaEncadeada(){
        this.fim = null;
        this.qtd = 0;
    }
    @Override
    public void empilhar(T elemento) throws Exception {
        No<T> novo = new No();
        novo.setDado(elemento);
        if(this.estaVazia()){
            novo.setProx(null);
            this.fim = novo;
            this.fim.setAnt(null);
        }else{

            this.fim.setProx(novo);
            novo.setAnt(this.fim);
            this.fim = novo;
        }
        qtd++;
    }

    @Override
    public T desempilhar() throws Exception {
        if(this.estaVazia()){
            throw new Exception("fila vazia");
        }

        T dado = (T) this.fim.getDado();
        this.fim.getAnt().setProx(null);
        this.fim = this.fim.getAnt();
        return dado;
    }

    @Override
    public T getTopo() throws Exception {
        return (T) this.fim;
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }

    @Override
    public boolean estaVazia() {
        if(this.fim == null){
            return true;
        }
        return false;
    }
}
