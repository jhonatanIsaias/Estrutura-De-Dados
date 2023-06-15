package tiposAbstratosDeDados.Listas.listaEncadeada;

import tiposAbstratosDeDados.EstructureFuncions;

public class Lista <T extends Comparable<T>> {
    private No<T> inicio;
    private No <T> fim;
    private No <T> aux;
    private No <T> anterior;
    private String valores;

    public Lista(){
        this.inicio = null;
        this.fim = null;
        this.aux = null;
        this.anterior = null;
    }


    public void incluirInicio(T dado) {
        No<T> novo = new No<>();
        novo.setNum(dado);

       if(this.inicio ==  null){

           this.inicio = novo;
           this.fim = novo;
           novo.setProx(null);
       }
       else if(dado.compareTo(this.inicio.getNum()) < 0){
           novo.setProx(this.inicio);
           this.inicio = novo;
       }
       else{
           this.aux = this.inicio;
           while((this.aux != null) && dado.compareTo(this.aux.getNum()) > 0){
            this.anterior = this.aux;
            this.aux = this.aux.getProx();

           }
           this.anterior.setProx(novo);
           novo.setProx(this.aux);

       }
    }


    public void incluirFinal(T dado) {
        No<T> novo = new No();
        novo.setNum(dado);

        if(this.inicio == null){
            this.inicio = novo;
            this.fim = novo;
            novo.setProx(null);
        }
        else if(dado.compareTo(this.fim.getNum()) > 0){
            this.fim.setProx(novo);// Nó antigo aponta para o novo nó.
            this.fim = novo;// O novo nó se torna o último
            this.fim.setProx(null);//  O novo nó não aponta para ninguém por ser o último

        }
        else{
            this.aux = this.inicio;
            while((this.aux != null) && dado.compareTo(this.aux.getNum()) > 0){
                this.anterior = this.aux;
                this.aux = this.aux.getProx();

            }
            this.anterior.setProx(novo);
            novo.setProx(this.aux);

        }
    }


    public String localizarElementoPelaPosicao(int chave) {
        return null;
    }


    public String localizarPosicacaoDoElemento(int elemento) {
        return null;
    }


    public void removerElemento(T chave) {

        if(this.inicio == null){
            return;
        }
        this.aux = this.inicio;

        boolean achou = false;

        while((this.aux != null) || (!achou)){
          if(this.inicio.getNum() == chave){
              this.inicio = this.inicio.getProx();
              this.aux = null;
              achou = true;

          }
          else if(this.aux.getNum() == chave){
              this.anterior.setProx(this.aux.getProx());
              this.aux = null;
              achou = true;
          }
          else if(this.fim.getNum() == chave){
              this.anterior.setProx(this.aux.getProx());
              this.aux = null;
              this.fim = this.anterior;
              achou = true;
          }
          else{
              this.anterior = this.aux;
              this.aux = this.aux.getProx();

          }
        }
        if(!achou){
            System.out.println("número não encontrado!");
        }
        else{
            System.out.println("número removido!");
        }
    }



   public String imprimirLista(){

      this.aux = this.inicio;
      while(this.aux != null){
         this.valores += aux.getNum()+" ";
          this.aux = this.aux.getProx();
      }
       String resultado = valores;
       valores = "";
      return resultado.replace("null","");

   }

}
