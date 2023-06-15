package tiposAbstratosDeDados.Listas.listaSequencial;

import tiposAbstratosDeDados.EstructureFuncions;

import java.util.Arrays;

public class Lista implements EstructureFuncions {
    private int[] lista;
    private int posVazia;
    private int posRemovida;

    public int getPosRemovida() {
        return this.posRemovida;
    }


    public int getPosVazia() {
        return this.posVazia;
    }

    public int[] getLista() {
        return this.lista;
    }


    public Lista(int tamanho) {
        /*

        * *QUANDO A LISTA É INICIADA UM TAMANHO JÁ É PASSADO OBRIGATORIAMENTE E
        *UMA A VARIÁVEL POSIÇÃO VAZIA É INSTACIADA ASSIM NÃO PRECISO PERCORRER O VETOR
        *PARA SABER ONDE TEM ESPAÇO VAZIO. E UMA VARIAVEL PARA CONTROLAR AS POSIÇÕES REMOVIDAS
        *TAMBÉM É INSTANCIADA.

         */
        lista = new int[tamanho];
        posVazia = 0;
        posRemovida = 0;
    }

    @Override
    public void incluirInicio(int dado) {
        /*

         * *VERIFICA SE A PRIMEIRA POSIÇÃO ESTÁ VAZIA, CASO ESTEJA
         * O NÚMERO É LOGO ADICIONADO . CASO CONTRÁRIO É VERIFICADO SE
         * ALGUM NÚMERO FOI EXCLUIDO, SE SIM O NÚMERO QUE ESTÁ ATUALMENTE
         * NA PRIMEIRA POSIÇÃO É ADICIONADO A ESSE ESPAÇO E O NÚMERO ADICONADO
         * OCULPA A PRIMEIRA POSIÇÃO. POR FIM CASO NENHUMA DESSAS CONDIÇÕES SEJA ATENDIDA O
         * NÚMERO QUE ESTAVA NA PRIMEIRA POSIÇÃO É MOVIDO PARA O PRIMEIRO
         * ESPAÇO VAZIO ENCONTRADO E O NÚMERO ADICONADO OCUPA A PRIMEIRA
         * POSIÇÃO.


         */

        if (lista[0] == 0) {
            this.lista[0] = dado;
            posVazia++;

        } else if (lista[posRemovida] == 0) {
            lista[posRemovida] = lista[0];
            lista[0] = dado;
        } else {
            lista[posVazia] = lista[0];
            lista[0] = dado;
            posVazia++;
        }

    }

    @Override
    public void incluirFinal(int dado) {
          /*

           *VERIFICA SE A ÚTILMA POSIÇÃO ESTÁ VAZIA, CASO ESTEJA
           * O NÚMERO É LOGO ADICIONADO . CASO CONTRÁRIO É VERIFICADO SE
           * ALGUM NÚMERO FOI EXCLUIDO, SE SIM O NÚMERO QUE ESTÁ ATUALMENTE
           * NA ÚTILMA POSIÇÃO É ADICIONADO A ESSE ESPAÇO E O NÚMERO ADICONADO
           * OCULPA A ÚTILMA POSIÇÃO. POR FIM CASO NENHUMA DESSAS CONDIÇÕES SEJA ATENDIDA O
           * NÚMERO QUE ESTAVA NA ÚLTIMA POSIÇÃO É MOVIDO PARA O PRIMEIRO
           * ESPAÇO VAZIO ENCONTRADO E O NÚMERO ADICONADO OCUPA A ÚLTIMA
           * POSIÇÃO.
         */

        if (lista[lista.length - 1] == 0) {
            lista[lista.length - 1] = dado;

        } else if (lista[posRemovida] == 0) {
            lista[posRemovida] = lista[lista.length - 1];
            lista[lista.length - 1] = dado;
        } else {
            lista[posVazia] = lista[lista.length - 1];
            lista[lista.length - 1] = dado;
            posVazia++;
        }

    }

    @Override
    public String localizarElementoPelaPosicao(int chave) {
        /*

        * O ÚSUARIO DIGITA A POSIÇÃO DO ELEMENTO, CASO A POSIÇÃO EXISTA(MENOR QUE A LISTA E MAIOR QUE 0)
        * O VALOR DO ELEMENTO É  RETORNADO.

        **/
        if (chave < lista.length - 1 && chave > 0) {
            return "o elemento que está na posição " + chave + " é " + lista[chave];
        }
        return "essa posição não existe";
    }
        @Override
        public String localizarPosicacaoDoElemento ( int elemento){
        /*

        * * o ÚSUARIO DIGITA O ELEMENTO PROCURADO CASO ELE ESTEJA DENTRO DA LISTA
        * SUA POSIÇÃO É RETORNADA.

        * */
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] == elemento) {
                    return "o elemento " + elemento + " está na posição " + i;
                }
            }
            return "seu elemento não foi encontrado";
        }

        @Override
        public void removerElemento ( int chave){
        /*
        A VARIÁVEL POSIÇÃO VAZIA RECEBE O ENDEREÇO DO DADO REMOVIDO
        */
            lista[chave] = 0;
            posRemovida = chave;

        }
        public int getTamanho () {
            return lista.length;
        }
        public String imprimirLista () {
            return Arrays.toString(lista);
        }
    }

