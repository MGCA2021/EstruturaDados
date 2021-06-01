package TAD_Arvore_Binaria;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class ArvoreBinaria implements Selecionavel {

    @Override
    public void inicializarEstrutura() {
    	 inicializarMenu();
        // TODO Auto-generated method stub
        
    }
    void inicializarMenu() {
        short selecionador = 0;
        do {
            System.out.println("Selecione uma das seguintes op��es: ");
            System.out.println("0. Voltar ao menu principal");
            System.out.println("1. Explica��o do tipo ArvoreBinaria");
            System.out.println("2. Explica��o da inser��o na ArvoreBinaria");
            System.out.println("3. Teste de inser��o na ArvoreBinaria");
            System.out.println("4. Explica��o da remo��o na ArvoreBinaria");
            System.out.println("5. Teste da remo��o na ArvoreBinaria");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 5);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("ArvoreBinaria encerrado");
                break;
            case 1:
            	System.out.println("\nA Arvore Binaria � da mesma forma que a arvore gen�rica, por�m a arvore binaria tem uma forma mais natural de implementar, \nela usa uma estrutura encadeada\n");
                break;
            case 2:
            	System.out.println("\nDesenho da arvore binaria para a equa��o (((7+5)*(3-1))/((2+9)+(14-5)-1))*10)\n"
            			+ "\n                         X               \n"
            			+ "\n                         | \\              \n"
            			+ "\n                         |   10              \n"
            			+ "\n                        �/.                     \n"
            			+ "\n                 /                      \\                  \n"
            			+ "\n                X                          -               \n"
            			+ "\n              /   \\                  /          \\               \n"
            			+ "\n            +       -                +            1             \n"  
            			+ "\n           /  \\    /  \\          /       \\                      \n"
            			+ "\n          7    5  3    1       +          -                       \n"
            			+ "\n                            /    \\       /   \\                   \n"
            			+ "\n                           2       9   14      5              \n"
            			+ "\n                                                    \n"
            			+ "\n                                                  \n");
                break;
            case 3:
                //chamar m�todo que de fato vai fazer uma inser��o numa lista arranjo
                break;
            case 4:
                //chamar m�todo que vai explicar como funciona a remo��o na lista arranjo
                break;
            case 5:
                //chamar m�todo que de fato vai fazer uma remo��o na lista arranjo
                break;
            /**
             * implementar os demais cases para as demais opera��es que da pra fazer numa lista arranjo
             */
            default: 
                break;
        }
    }
}
