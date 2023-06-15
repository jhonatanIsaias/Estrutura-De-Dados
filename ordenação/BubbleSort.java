package ordenação;

public class BubbleSort implements   MethodOrder {
    public void ordenar(int[] dados) {
        boolean teveTroca = dados.length > 1;
        for(int i = 0; i < dados.length  && teveTroca; ++i){

            teveTroca = false;
            for(int j = dados.length -1; j > i;j--) {
                if(dados[j] < dados[j-1]) {
                    int aux = dados[j];
                    dados[j] = dados[j-1];
                    dados[j-1] = aux;
                    teveTroca = true;

                    // melhor caso : O(n) dados já ordenados
                    //pior caso: O(n^2) todos os dados fora de ordem
                }
            }
        }
    }
}
