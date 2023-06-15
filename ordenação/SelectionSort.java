package ordenação;

public class SelectionSort implements MethodOrder {
    @Override
    public void ordenar(int[] dados) {

      /*  int aux = 0;


        for(int i = 0; i < dados.length; i++){

            int j = dados.length -1;

            while( j > i){

                if(dados[i] > dados[j]) {
                    aux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = aux;

                }
                j--;
            }

        }*/


        int pos_min = 0;
        int aux = 0;


        for(int j = 0; j < dados.length -1; j++) {
            pos_min = j;
            for (int i = j+1; i < dados.length; i++) {

                if (dados[i] < dados[pos_min]) {
                    pos_min = i;
                }

            }

            if (dados[j] > dados[pos_min]) {
                aux = dados[j];
                dados[j] = dados[pos_min];
                dados[pos_min] = aux;


            }

        }

    }
}
