package tiposAbstratosDeDados.filas;

import tiposAbstratosDeDados.filas.Fila;

public class FilaSequencialCircular extends Fila<Integer> {

    private int[] filaSequencialCircular;
    private int inicio;
    private int fim;

   public FilaSequencialCircular(int tamanho){
       this.filaSequencialCircular = new int[tamanho];
       this.fim = this.filaSequencialCircular.length -1;
       this.inicio = this.fim;
   }


    @Override
    public void enfileirar(int dado) throws Exception {
       if(filaSequencialCircular[fim] != 0){
           throw  new Exception("fila cheia");
       }
        this.filaSequencialCircular[fim] = dado;
        this.fim = (int)(this.fim -1 + filaSequencialCircular.length) % filaSequencialCircular.length;
    }

    @Override
   public void desenfileirar() throws Exception {
       if(filaSequencialCircular[inicio] == 0){
           throw new Exception("fila vazia");
       }
        this.filaSequencialCircular[inicio] = 0;
        this.inicio =(int) (this.inicio -1 + filaSequencialCircular.length) % filaSequencialCircular.length;
   }
}
