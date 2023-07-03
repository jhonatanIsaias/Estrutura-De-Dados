package tiposAbstratosDeDados.filas;

import tiposAbstratosDeDados.filas.Fila;

public class FilaSequencialCircular<T> extends Fila<T> {

    private T[] filaSequencialCircular;
    private int inicio;
    private int fim;

   public FilaSequencialCircular(Class infoCategoria,int tamanho){
       this.filaSequencialCircular = (T[]) java.lang.reflect.Array.newInstance(infoCategoria, tamanho);
       this.fim = this.filaSequencialCircular.length -1;
       this.inicio = this.fim;
   }


    @Override
    public void enfileirar(T dado) throws Exception {
       if(filaSequencialCircular[fim] != null){
           throw  new Exception("fila cheia");
       }
        this.filaSequencialCircular[fim] = dado;
        this.fim =(this.fim -1 + filaSequencialCircular.length) % filaSequencialCircular.length;
    }

    @Override
   public T desenfileirar() throws Exception {
       if(filaSequencialCircular[inicio] == null){
           throw new Exception("fila vazia");
       }
       T aux = this.filaSequencialCircular[this.inicio];
        this.filaSequencialCircular[inicio] = null;
        this.inicio = (this.inicio -1 + filaSequencialCircular.length) % filaSequencialCircular.length;
        return aux;
   }
}
