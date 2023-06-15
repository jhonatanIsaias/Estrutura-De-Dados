package ordenação;

import java.util.Arrays;

public class MergeSort implements MethodOrder  {
    @Override
    public void ordenar(int[] dados) {
        ordenar(dados,0,dados.length -1);
    }
   private void ordenar(int[] dados, int inicio , int fim) {

        if(inicio < fim){
           int meio = (int)((fim + inicio) / 2);
           ordenar(dados,inicio,meio);
           ordenar(dados, meio+1,fim);
           merge(dados, inicio,meio,fim);
        }

    }

    public void merge(int[] valores,int inicio, int meio, int fim){
        int inicioValoresEsquerda = inicio;
        int fimValoresEsquerda = meio;
        int inicioValoresDireita = meio +1;
        int fimValoresDireita = fim;
        int[] vetorTemporario = new int[fim-inicio+1];
        int posTemp = 0;
        while (inicioValoresEsquerda <= meio && inicioValoresDireita <=fim){
            if(valores[inicioValoresEsquerda] < valores[inicioValoresDireita] ){
                vetorTemporario[posTemp] = valores[inicioValoresEsquerda];
                inicioValoresEsquerda++;
            } else {
                vetorTemporario[posTemp] = valores[inicioValoresDireita];
                inicioValoresDireita++;
            }
            posTemp++;
        }
        for(int i = inicioValoresEsquerda; i <= meio; i++){
            vetorTemporario[posTemp] = valores[i];
            posTemp++;
        }
        for(int i = inicioValoresDireita; i <= fim; i++){
            vetorTemporario[posTemp] = valores[i];
            posTemp++;
        }
        for(int i = 0; i < posTemp; i ++){
            valores[inicio+i] = vetorTemporario[i];
        }


    }


}
