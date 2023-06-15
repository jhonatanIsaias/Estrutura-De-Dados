package tiposAbstratosDeDados.Listas.listaSequencial;
import tiposAbstratosDeDados.Valida;


import java.util.Scanner;

public class app {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Valida valida = new Valida();
        String num = null;
        String tamanho  = "";
        String opcao  = "";

        /*
       * VALIDANDO O TAMANHO DO VETOR VENDO SE É REALMENTE UM NÚMERO E SE ESSE NÚMERO
       É POSITIVO. SÓ ASSIM UMA NOVA LISTA É CRIADA*
        */
       while(tamanho.equals("")){

        try{
            System.out.println("digite o tamanho da sua lista");
            tamanho = ler.nextLine();
            valida.validarTamanho(tamanho);


        }catch (RuntimeException e){

            System.out.println(e.getMessage());
            tamanho = "";

        }
       }

        Lista lista = new Lista(Integer.parseInt(tamanho)); // CRIANDO UMA NOVA LISTA

        /*
       * COMEÇO DO PROGRAMA ONDE A LISTA PODE SER MANIPULADA*
       * ESSA LISTA SÓ ACEITA NUMEROS A PARTIR DE 1*
       * SE A LISTA TIVER ALGUM ESPAÇO COM O  NUMERO "0" SIGNIFICA QUE AQUELE ESPAÇO ESTÁ  VAZIO*
        */
       while(!opcao.equals("0")) {

                try {

                    System.out.println("digite o que você quer fazer com a lista: ");
                    System.out.println("opção 0 - sair do programa \n" +
                            "Opção 1 - adicionar número no inicio \n" +
                            "Opção 2 - adicionar no final \n" +
                            "Opção 3 - remover elemento \n" +
                            "Opção 4 - localizar elemento pela posição \n" +
                            "Opção 5 - localizar posição do elemento" );
                    opcao = ler.nextLine();
                    if(Integer.parseInt(opcao) == 0){
                        System.out.println("você saiu do programa");
                        return;
                    }
                    valida.validarNumero(opcao);

                    switch (Integer.parseInt(opcao)){
                        case 1 :
                            System.out.println("digite um numero que quer adicionar no incio: ");
                            num = ler.nextLine();
                            valida.validarNumero(num); // VERIFICA SE É REALMENTE UM NÚMERO
                            valida.validarDado(Integer.parseInt(num)); //VERIFICA SE ESSE NÚMERO É DIFERENTE DE  0
                            valida.validarVetor(lista.getLista(),lista.getPosVazia(), lista.getPosRemovida()); // VERIFICA SE O VETOR ESTÁ CHEIO
                            lista.incluirInicio(Integer.parseInt(num)); // EXECULTA A FUNÇÃO SELECIONA
                            System.out.println(lista.imprimirLista()); // IMPRIMI A LISTA
                            break;
                        case 2:
                            System.out.println("digite um numero que quer adicionar no final: ");
                            num = ler.nextLine();
                            valida.validarNumero(num);
                            valida.validarDado(Integer.parseInt(num));
                            valida.validarVetor(lista.getLista(),lista.getPosVazia(),lista.getPosRemovida());
                            lista.incluirFinal(Integer.parseInt(num));
                            System.out.println(lista.imprimirLista());
                            break;
                        case 3:
                            System.out.println("digite a posição do elemento que deseja remover: ");
                            num = ler.nextLine();
                            valida.validarNumero(num);
                            valida.validarChave(Integer.parseInt(num)); // VERIFICA SE A CHAVE NÃO É NEGATIVA
                            lista.removerElemento(Integer.parseInt(num));
                            System.out.println(lista.imprimirLista());
                            break;
                        case 4:
                            System.out.println("digite a posição do elemento:");
                            num = ler.nextLine();
                            valida.validarNumero(num);
                            valida.validarChave(Integer.parseInt(num));
                            valida.validarDado(Integer.parseInt(num));
                            System.out.println(lista.localizarElementoPelaPosicao(Integer.parseInt(num)));
                            break;
                        case 5:
                            System.out.println("digite o valor do elemento que procura:");
                            num = ler.nextLine();
                            valida.validarNumero(num);
                            valida.validarChave(Integer.parseInt(num));
                            valida.validarDado(Integer.parseInt(num));

                            System.out.println(lista.localizarPosicacaoDoElemento(Integer.parseInt(num)));
                            break;

                        default:
                            System.out.println("digite uma opção válida");
                    }



                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    System.out.println(lista.imprimirLista());
                }
            }

        }
    }

