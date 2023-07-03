package tiposAbstratosDeDados.filas;

public class FilaEncadeada<T> extends Fila<T>{
    private No inicio;

    private No fim;
    private No aux;

    public FilaEncadeada(){
        this.inicio = null;
        this.fim = null;
        this.aux = null;
    }
    @Override
    public void enfileirar(T dado) throws Exception {
        No<T> novo = new No();
        novo.setProx(null);
        if(this.inicio == null){
            this.inicio = novo;
            this.fim = this.inicio;
        }
        else{
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    @Override
    public T desenfileirar() throws Exception {
        if(this.fim == null){
            throw new Exception("fila vazia");
        }
        this.aux = this.inicio;
        this.inicio = this.inicio.getProx();
        return (T) this.aux;
    }
}
