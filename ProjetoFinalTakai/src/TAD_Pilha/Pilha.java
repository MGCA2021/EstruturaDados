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
            System.out.println("Selecione uma das seguintes opções: ");
            System.out.println("0. Voltar ao menu principal");
            System.out.println("1. Explicação do tipo Pilha");
            System.out.println("2. Explicação da inserção na Pilha");
            System.out.println("3. Explicação da remoção na Pilha");
            System.out.println("4. Explicação do tamanho da Pilha");
            System.out.println("5. Explicação de como saber quem esta no topo da Pilha");
            System.out.println("6. Explicação da da fila vazia na Pilha");
            System.out.println("7. Explicação da Pilha usando LSE");
            
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
            	System.out.println("\nPilha basicamente é a mesma definição de uma Pilha de pratos, o Último que entra é o primeiro que sai, \nPilhas são consideradas a estrutura de dados mais simples\n");
                break;
            case 2:
            	System.out.println("Para Adicionarmos um elemento na Pilha, usamos o Push(e), e = elemento a ser inserido\r\n"
            			+ "EXEMPLO\n"
            			+ "       Push(14) – Saida (14)\r\n"
            			+ "       Push(7) – Saida (14, 7)\r\n"
            			+ "       Push(21) – Saida (14, 7, 21)\r\n"
            			+ "       Push(49) – Saida (14, 7, 21, 49)\r\n"
            			);                
            	break;
            case 3:
            	System.out.println("Para Removermos um elemento na Pilha, usamos o Pop(), Vazio, pois ele eliminara o ultimo índice inserido, pois é ele que está no topo\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "       Pop() – Saida (14, 7, 21)    - Removeu o 49\r\n"
            			+ "       Pop() – Saida (14, 7)        - Removeu o 21\r\n"
            			+ "       Pop() – Saida (14)           - Removeu o 7\r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);                
            	break;
            case 4:
                System.out.println("Também podemos verificar o tamanho da Pilha Size(), Retorna o numero de elementos na Pilha\r\n"
                		+ "EXEMPLO\n"
                		+ "Pilha (14, 7, 21, 49)\r\n"
                		+ "       Size() – Saida (4)    \r\n"
                		);
                break;
            case 5:
            	System.out.println("A pilha possui o método Top(), que retorna o elemento no topo da pilha, sem retira-lo\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "       Top() – Saida (49)    \r\n"
            			+ "\nOBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			);
                break;
                
            case 6:
            	System.out.println("A pilha possui o método isEmpty(), que retorna um booleano indicando se a pilha esta vazia ou não\r\n"
            			+ "EXEMPLO\n"
            			+ "Pilha (14, 7, 21, 49)\r\n"
            			+ "isEmpty () – Saida (false)    \r\n"
            			);
                break;
                
            case 7:
            	System.out.println("Na Pilha tem um problema de ter que antecipar o tamanho máximo da Pilha, Para arrumar isso, utilizamos o LSE, onde os Nodos são alocados dinamicamente,\r\n"
            			+ "O topo da pilha será na cabeça, pois ajuda na inserção e remoção dos elementos \r\n"
            			+ "\r\n"
            			+ "Para Adicionarmos um elemento na Pilha, usamos o Push(e), e = elemento a ser inserido\r\n"
            			+ "EX. Push(14) – Saida (14)\r\n"
            			+ "       Push(7) – Saida (7, 14)\r\n"
            			+ "       Push(21) – Saida (21, 7, 14)\r\n"
            			+ "       Push(49) – Saida (49, 21, 7, 14)\r\n"
            			+ "\r\n"
            			+ "Para Removermos um elemento na Pilha, usamos o Pop(), Vazio, pois ele eliminara o ultimo índice inserido, pois é ele que está no topo\r\n"
            			+ "EX. Pilha (49, 21, 7, 14)\r\n"
            			+ "       Pop() – Saida (21, 7, 14)- Removeu o 49\r\n"
            			+ "       Pop() – Saida (7, 14)- Removeu o 21\r\n"
            			+ "       Pop() – Saida (14)           - Removeu o 7\r\n"
            			+ "OBS. Ocorre um erro se a pilha estiver vazia\r\n"
            			+ ""
            			);
                break;
            default: 
                break;
        }
    }
}

