package ordenação;

public class InsertionShort implements MethodOrder {
    int j = 0;
    int aux = 0;
    @Override
    public void ordenar(int[] dados) {
       for(int i = 1; i < dados.length; i++){

           j = i-1;
           aux = dados[i];

          while(j >= 0 && (dados[j] > aux)){

                dados[j+1] = dados[j];
                j = j-1;
          }
          dados[j+1] = aux;
            //melhor caso : O(n)
           // pior caso: O(n^2)
       }
    }
}
