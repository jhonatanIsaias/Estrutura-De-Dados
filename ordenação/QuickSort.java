package ordenação;

public class QuickSort implements MethodOrder{
    @Override
    public void ordenar(int[] dados) {
        ordenar(dados,0,dados.length -1);
    }
    private void ordenar(int[] dados,int inicio, int fim){
      if(inicio < fim){
          int pivo = particao(dados,inicio,fim);
          ordenar(dados,inicio,pivo);
          ordenar(dados,pivo +1, fim);

      }
    }

    private void trocar(int[] dados,int i , int j){
        int aux = dados[i];
        dados[i] = dados[j];
        dados[j] = aux;
    }

    private int particao(int[] dados, int inicio, int fim){
        int meio = (int)(inicio + fim)/2;
        int i = inicio;
        int j = fim;
        int pivo = dados[meio];
        while(i < j){
            if(pivo >= dados[j]){
                if(pivo <= dados[i]){
                    trocar(dados,i,j);
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
            else{
                j--;
            }
        }
        return j;
    }


}
