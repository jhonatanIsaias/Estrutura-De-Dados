package AtividadePontuada.app;

import AtividadePontuada.Lista;
import tiposAbstratosDeDados.Listas.listaDuplamenteEncadeada.No;

import java.util.Scanner;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T> {

    private No<T> inicio;
    private No<T> aux;

    @Override
    public void incluir(T elemento) throws Exception {

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        No<T> novo = new No<>();
        novo.setNum(elemento);
        int cont = 0;
        this.aux = this.inicio;

        if ((this.inicio == null && posicao == 0)) {
            this.inicio = novo;
            novo.setProx(null);
            novo.setAnterior(null);
            return;
        }
        else if((posicao == 0)){
            novo.setAnterior(null);
            novo.setProx(this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
            return;
        }
      while (this.aux != null){
          if(cont == posicao){
              novo.setAnterior(aux.getAnterior());
              aux.getAnterior().setProx(novo);
              aux.setAnterior(novo);
              novo.setProx(aux);
              return;
          }else{
              cont++;
              this.aux = this.aux.getProx();
          }
      }
      if(cont != posicao){
          throw new Exception("não posivel adicionar seu número , pois a lista tem menos posições ou está vazia");
      }

    }

    @Override
    public T get(int posicao) throws Exception {
        return null;
    }

    @Override
    public int get(T elemnto) throws Exception {
        return 0;
    }

    @Override
    public void remover(int posicao) throws Exception {

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return 0;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        return false;
    }

    @Override
    public Lista<T> subLista(int posInicial, int posFinal) throws Exception {
        ListaDupEnc<T> subLista = new ListaDupEnc<>();
        int cont = 0;
        this.aux = this.inicio;
        while(this.aux != null && cont <= posFinal){
            if((cont >= posInicial)){
                subLista.incluir(this.aux.getNum());
                cont++;
                this.aux =this.aux.getProx();

            }
            else{
                cont++;
                this.aux = this.aux.getProx();
            }
        }
        if(cont < posFinal){
            throw new Exception("não foi possivel passar toda a lista pois a ela é menor que a posição final encontrada");
        }

        return subLista;
    }



}
