package tiposAbstratosDeDados;

public class Valida implements Validations{

    @Override
    public void validarDado(int dado) {
        if(dado == 0){
            throw new RuntimeException("a lista só aceita numeros a partir de um");
        }
    }

    @Override
    public void validarVetor(int[] lista, int posVazia, int posRemovida) {
        if(lista[posVazia] != 0 && lista[posRemovida] != 0){
            throw new RuntimeException("lista cheia");
     }

    }

    @Override
    public void validarChave(int chave) {
        if(chave < 0){
            throw new RuntimeException("digite uma chave válida");
        }
    }

    @Override
    public void validarNumero(String number1) {
        boolean valida = number1.matches("-?\\d+(\\.\\d+)?") ? true:false;
        if(!valida){
            number1 = null;
            throw new RuntimeException("digite apenas números");
        }
    }

    @Override
    public void validarTamanho(String tamanho) {
        boolean valida = tamanho.matches("-?\\d+(\\.\\d+)?") && (Integer.parseInt(tamanho) > 0)? true:false;
        if(!valida){
            tamanho = null;
            throw new RuntimeException("digite um tamanho válido(número positivo)");
        }
    }
}
