package TAD_Pilha;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class Pilha implements Selecionavel{
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
            System.out.println("1. Explica��o do tipo Pilha");
            System.out.println("2. Explica��o da inser��o na Pilha");
            System.out.println("3. Explica��o da remo��o na Pilha");
            System.out.println("4. Explica��o do tamanho da Pilha");
            System.out.println("5. Explica��o de como saber quem esta no topo da Pilha");
            System.out.println("6. Explica��o da da fila vazia na Pilha");
            System.out.println("7. Explica��o da Pilha usando LSE");
            
            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 7);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Pilha encerrado");
                break;
            case 1:
            	System.out.println("\nPilha basicamente � a mesma defini��o de uma Pilha de pratos, o �ltimo que entra � o primeiro que sai, \nPilhas s�o consideradas a estrutura de dados mais simples\n");
                break;
            case 2:
            	System.out.println("Para Adicionarmos um elemento na Pilha, usamos o Push(e), e = elemento a ser inserido\r\n"
            			+ "EXEMPLO\n"
            			+ "       Push(14) � Saida (14)\r\n"
            			+ "       Push(7) � Saida (14, 7)\r\n"
            			+ "       Push(21) � Saida (14, 7, 21)\r\n"
            			+ "       Push(49) � Saida (14, 7, 21, 49)\r\n"
            			);                
            	break;
            case 3:
            	System.out.println("Para Removermos um elemento na Pilha, usamos o Pop(), Vazio, pois ele eliminara o ultimo �ndice inserido, pois � ele que est� no topo\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "       Pop() � Saida (14, 7, 21)    - Removeu o 49\r\n"
            			+ "       Pop() � Saida (14, 7)        - Removeu o 21\r\n"
            			+ "       Pop() � Saida (14)           - Removeu o 7\r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);                
            	break;
            case 4:
                System.out.println("Tamb�m podemos verificar o tamanho da Pilha Size(), Retorna o numero de elementos na Pilha\r\n"
                		+ "EXEMPLO\n"
                		+ "Pilha (14, 7, 21, 49)\r\n"
                		+ "       Size() � Saida (4)    \r\n"
                		);
                break;
            case 5:
            	System.out.println("A pilha possui o m�todo Top(), que retorna o elemento no topo da pilha, sem retira-lo\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "       Top() � Saida (49)    \r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);
                break;
                
            case 6:
            	System.out.println("A pilha possui o m�todo isEmpty(), que retorna um booleano indicando se a pilha esta vazia ou n�o\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "isEmpty () � Saida (false)    \r\n"
            			);
                break;
                
            case 7:
            	System.out.println("Na Pilha tem um problema de ter que antecipar o tamanho m�ximo da Pilha, Para arrumar isso, utilizamos o LSE, onde os Nodos s�o alocados dinamicamente,\r\n"
            			+ "O topo da pilha ser� na cabe�a, pois ajuda na inser��o e remo��o dos elementos \r\n"
            			+ "\r\n"
            			+ "Para Adicionarmos um elemento na Pilha, usamos o Push(e), e = elemento a ser inserido\r\n"
            			+ "EX. Push(14) � Saida (14)\r\n"
            			+ "       Push(7) � Saida (7, 14)\r\n"
            			+ "       Push(21) � Saida (21, 7, 14)\r\n"
            			+ "       Push(49) � Saida (49, 21, 7, 14)\r\n"
            			+ "\r\n"
            			+ "Para Removermos um elemento na Pilha, usamos o Pop(), Vazio, pois ele eliminara o ultimo �ndice inserido, pois � ele que est� no topo\r\n"
            			+ "EX. Pilha (49, 21, 7, 14)\r\n"
            			+ "       Pop() � Saida (21, 7, 14)- Removeu o 49\r\n"
            			+ "       Pop() � Saida (7, 14)- Removeu o 21\r\n"
            			+ "       Pop() � Saida (14)           - Removeu o 7\r\n"
            			+ "OBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			+ ""
            			);
                break;
            default: 
                break;
        }
    }
}

