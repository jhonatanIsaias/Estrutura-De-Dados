package tiposAbstratosDeDados.Listas.listaDuplamenteEncadeada;



public class Lista<T extends Comparable<T>> {
    private No<T> inicio;
    private No<T> fim;
    private No<T> aux;
    private String valores;

    public Lista(){
        this.inicio = null;
        this.fim = null;
        this.aux = null;

    }
    public void adicionar(T dado) {
        No<T> novo = new No<>();
        novo.setNum(dado);

        if (this.inicio == null) {
            this.inicio = novo;
            this.fim = novo;
            novo.setProx(null);
            novo.setAnterior(null);
        }
        else if(novo.getNum().compareTo(this.inicio.getNum()) < 0){
            novo.setAnterior(null);
            novo.setProx(this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
        else if(novo.getNum().compareTo(this.fim.getNum()) > 0){
            novo.setAnterior(this.fim);
            novo.setProx(null);
            this.fim.setProx(novo);
            this.fim = novo;
        }
        else{
            this.aux = this.inicio;
            while((this.aux != null) && dado.compareTo(this.aux.getNum()) > 0){
                this.aux = this.aux.getProx();
            }
            this.aux.getAnterior().setProx(novo);
            novo.setAnterior(this.aux.getAnterior());
            novo.setProx(this.aux);
            this.aux.setAnterior(novo);

        }


    }
    public void removerElemento(T dado){

        boolean achou = false;
        if(this.inicio == null){
            return;
        }
        this.aux = this.inicio;

        while((this.aux != null) && (!achou)){
            if(this.inicio.getNum() == dado){
                this.inicio = this.inicio.getProx();
                this.inicio.setAnterior(null);
                this.aux = null;
                achou = true;

            }
            else if(this.aux.getNum() == dado){
                this.aux.getAnterior().setProx(this.aux.getProx());
                this.aux.getProx().setAnterior(this.aux.getAnterior());
                this.aux  = null;
                achou = true;
            }
            else if(this.fim.getNum() == dado){
                this.fim.getAnterior().setProx(this.fim.getProx());
                this.fim = this.fim.getAnterior();
                this.aux  = null;
                achou = true;
            }
            else{
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
    public String imprimirCincoPrimeiros(){
        int i = 0;
        this.valores = null;
        this.aux = this.inicio;
        while(this.aux != null && i < 3){
            this.valores += aux.getNum()+" ";
            this.aux = this.aux.getProx();
            i++;
        }
        return this.valores.replace("null","");
    }
    public String imprimirCincoUltimos(){
        int i = 0;
        this.valores = null;
        this.aux = this.fim;
        while(this.aux != null && i < 3){
            this.valores += aux.getNum()+" ";
            this.aux = this.aux.getAnterior();
            i++;
        }
        return this.valores.replace("null","");
    }

}
