package TAD_Fila;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class Fila implements Selecionavel {

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
            System.out.println("1. Explica��o do tipo Fila");
            System.out.println("2. Explica��o da inser��o na Fila");
            System.out.println("3. Explica��o da remo��o na Fila");
            System.out.println("4. Explica��o do tamanho da Fila");
            System.out.println("5. Explica��o de quem esta na frente da Fila");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 5);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Fila encerrado");
                break;
            case 1:
            	System.out.println("\nComo o nome j� diz, � uma Fila, s�o Inseridos e removidos de acordo com o princ�pio \n�o primeiro que entra � o primeiro que sai�,\n"
            			+ "geralmente os elementos entram por tr�s e saem pela frente\n"
            			+ "fila podem ser imaginadas como as que ocorre numa fila de pessoas num banco\r\n"
            			);
                break;
            case 2:
            	System.out.println("Para Adicionarmos um elemento na Fila, usamos o enqueue(e), e = elemento a ser inserido\r\n"
            			+"EXEMPLO\n"
            			+ "       enqueue (14) � Saida (14)\r\n"
            			+ "       enqueue (7) � Saida (14, 7)\r\n"
            			+ "       enqueue (21) � Saida (14, 7, 21)\r\n"
            			+ "       enqueue (49) � Saida (14, 7, 21, 49)\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para Removermos um elemento na Fila, usamos o dequeue(), Vazio, pois ele eliminara o ultimo �ndice inserido, pois � ele que est� no topo\r\n"
            			+"EXEMPLO\n"
            			+ "Fila (14, 7, 21, 49)\r\n"
            			+ "       dequeue () � Saida (7, 21, 49)- Removeu o 14\r\n"
            			+ "       dequeue () � Saida (21, 49)     - Removeu o 7\r\n"
            			+ "       dequeue () � Saida (49)           - Removeu o 21\r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);
                break;
            case 4:
            	System.out.println("Tamb�m podemos verificar o tamanho da Pilha Size(), Retorna o numero de elementos na Pilha\r\n"
            			+"EXEMPLO\n"
            			+ "Fila (14, 7, 21, 49)\r\n"
            			+ "       Size() � Saida (4)\r\n"
            			);
                break;
            case 5:
            	System.out.println("A Fila possui o m�todo Front(), que retorna o elemento na frente da Fila, sem retira-lo\r\n"
            			+"EXEMPLO\n"
            			+ "Fila (14, 7, 21, 49)\r\n"
            			+ "       Front() � Saida (14)    \r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);
                break;
           
            default: 
                break;
        }
    }
}
