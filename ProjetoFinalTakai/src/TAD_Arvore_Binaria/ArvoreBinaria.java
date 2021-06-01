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
            	System.out.println("\nA Arvore Binaria � da mesma forma que a arvore gen�rica, por�m a arvore binaria tem uma \r\n"
            			+ "forma mais natural de implementar, ela usa uma estrutura encadeada\r\n"
            			+ "Ela � uma estrutura de dados �til quando precisam ser tomadas decis�es bidirecionais \r\n"
            			+ "em cada ponto de um processo. O n�mero de compara��es pode ser reduzido \r\n"
            			+ "usando-se uma �rvore bin�ria. O primeiro n�mero na lista � colocado num n� \r\n"
            			+ "estabelecido como a raiz de uma �rvore bin�ria com as sub�rvores esquerda e direita \r\n"
            			+ "vazias. Como outra aplica��o das �rvores bin�rias, temos o m�todo de representar \r\n"
            			+ "uma express�o aritm�tica contendo operandos e operadores bin�rios por uma �rvore \r\n"
            			+ "estritamente bin�ria.\r\n"
            			+ "Onde a raiz da �rvore estritamente bin�ria onde a raiz da �rvore estritamente bin�ria \r\n"
            			+ "conter� um operador que deve ser aplicado aos resultados das avalia��es das \r\n"
            			+ "express�es representadas pelas sub�rvores esquerda e direita.\r\n"
            			);
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
            
            default: 
                break;
        }
    }
}
