package tiposAbstratosDeDados.filas;
import tiposAbstratosDeDados.filas.FilaSequencialCircular;

import java.util.Scanner;
public class testeFilaSequencialCircular {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num = 0;
       int tamanho  = 0;
       int opcao  = 10000;

        /*
       * VALIDANDO O TAMANHO DO VETOR VENDO SE É REALMENTE UM NÚMERO E SE ESSE NÚMERO
       É POSITIVO. SÓ ASSIM UMA NOVA LISTA É CRIADA*
        */
        while(tamanho == 0){

            try{
                System.out.println("digite o tamanho da sua lista");
                tamanho = ler.nextInt();



            }catch (RuntimeException e){

                System.out.println(e.getMessage());
                tamanho = 0;

            }
        }

        FilaSequencialCircular filaSequencialCircular = new FilaSequencialCircular(tamanho);

        /*
         * COMEÇO DO PROGRAMA ONDE A LISTA PODE SER MANIPULADA*
         * ESSA LISTA SÓ ACEITA NUMEROS A PARTIR DE 1*
         * SE A LISTA TIVER ALGUM ESPAÇO COM O  NUMERO "0" SIGNIFICA QUE AQUELE ESPAÇO ESTÁ  VAZIO*
         */
        while(opcao != 0) {

            try {

                System.out.println("digite o que você quer fazer com a lista: ");
                System.out.println("opção 0 - sair do programa \n" +
                        "Opção 1 - emfileirar \n" +
                        "Opção 2 - desenfileirar" );
                opcao =  ler.nextInt();;
                if(opcao == 0){
                    System.out.println("você saiu do programa");
                    return;
                }

                switch (opcao){
                    case 1 :
                        System.out.println("digite um numero que quer enfileirar: ");
                        num = ler.nextInt();
                        filaSequencialCircular.enfileirar(num);

                        break;
                    case 2:
                        filaSequencialCircular.desenfileirar();
                        System.out.println("numero desenfileirado: ");
                        break;


                    default:
                        System.out.println("digite uma opção válida");
                }



            }  catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
