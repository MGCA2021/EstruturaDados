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
            System.out.println("Selecione uma das seguintes opções: ");
            System.out.println("0. Voltar ao menu principal");
            System.out.println("1. Explicação do tipo ArvoreBinaria");
            System.out.println("2. Explicação da inserção na ArvoreBinaria");
            System.out.println("3. Teste de inserção na ArvoreBinaria");
            System.out.println("4. Explicação da remoção na ArvoreBinaria");
            System.out.println("5. Teste da remoção na ArvoreBinaria");

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
            	System.out.println("\nA Arvore Binaria é da mesma forma que a arvore genérica, porém a arvore binaria tem uma forma mais natural de implementar, \nela usa uma estrutura encadeada\n");
                break;
            case 2:
            	System.out.println("\nDesenho da arvore binaria para a equação (((7+5)*(3-1))/((2+9)+(14-5)-1))*10)\n"
            			+ "\n                         X               \n"
            			+ "\n                         | \\              \n"
            			+ "\n                         |   10              \n"
            			+ "\n                        °/.                     \n"
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
                //chamar método que de fato vai fazer uma inserção numa lista arranjo
                break;
            case 4:
                //chamar método que vai explicar como funciona a remoção na lista arranjo
                break;
            case 5:
                //chamar método que de fato vai fazer uma remoção na lista arranjo
                break;
            /**
             * implementar os demais cases para as demais operações que da pra fazer numa lista arranjo
             */
            default: 
                break;
        }
    }
}
