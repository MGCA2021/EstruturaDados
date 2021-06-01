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
            System.out.println("2. Desenho da ArvoreBinaria");


            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 2);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("ArvoreBinaria encerrado");
                break;
            case 1:
            	System.out.println("\nA Arvore Binaria é da mesma forma que a arvore genérica, porém a arvore binaria tem uma \r\n"
            			+ "forma mais natural de implementar, ela usa uma estrutura encadeada\r\n"
            			+ "Ela é uma estrutura de dados útil quando precisam ser tomadas decisões bidirecionais \r\n"
            			+ "em cada ponto de um processo. O número de comparações pode ser reduzido \r\n"
            			+ "usando-se uma árvore binária. O primeiro número na lista é colocado num nó \r\n"
            			+ "estabelecido como a raiz de uma árvore binária com as subárvores esquerda e direita \r\n"
            			+ "vazias. Como outra aplicação das árvores binárias, temos o método de representar \r\n"
            			+ "uma expressão aritmética contendo operandos e operadores binários por uma árvore \r\n"
            			+ "estritamente binária.\r\n"
            			+ "Onde a raiz da árvore estritamente binária onde a raiz da árvore estritamente binária \r\n"
            			+ "conterá um operador que deve ser aplicado aos resultados das avaliações das \r\n"
            			+ "expressões representadas pelas subárvores esquerda e direita.\r\n"
            			);
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
            
            default: 
                break;
        }
    }
}
