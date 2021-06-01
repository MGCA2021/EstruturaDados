package TAD_Fila_Prioridade;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class FilaDePrioridade implements Selecionavel {

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
            System.out.println("1. Explica��o do tipo FilaDePrioridade");
            System.out.println("2. Explica��o da inser��o na FilaDePrioridade");
            System.out.println("3. Explica��o da constulta o elemento com menor chave da FilaDePrioridade");
            System.out.println("4. Explica��o da remo��o na FilaDePrioridade");
            System.out.println("5. Explica��o da constulta do tamanho da FilaDePrioridade");
            System.out.println("6. Explica��o da FilaDePrioridade usando HEAP");
            
            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 6);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("FilaDePrioridade encerrado");
                break;
            case 1:
            	System.out.println("\nA Fila de Prioridade armazena elementos de acordo com suas prioridades e n�o tem no��o de\n posi��o, ele armazena uma cole��o de elementos priorizando que suporta a inser��o de\n elementos arbitr�rios, mas a remo��o de elementos ocorre em ordem de prioridade.\n");
                break;
            case 2:
            	System.out.println("Para adicionarmos um elemento na Fila de Prioridade usamos o Insert(k, x), k = chave, x = elemento\r\n"
            			+ "EXEMPLO\n"
            			+ "      Insert(7, A) -  Saida{(7,A)}\r\n"
            			+ "      Insert(14, D) -  Saida{(7, A), (14, D)}\r\n"
            			+ "      Insert(5, B) -  Saida{(5, B), (7, A), (14, D)}\r\n"
            			+ "      Insert(10, C) -  Saida{(5, B), (7, A), (10, C), (14, D)}\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para consultarmos o elemento com menor chave usamos o min()\r\n"
            			+ "EXEMPLO\n"
            			+ "Fila de Prioridade {(5, B), (7, A), (10, C), (14, D)}\r\n"
            			+ "     Min() -  Saida{(5, B)}\r\n"
            			);
                break;
            case 4:
            	System.out.println("Para removermos um elemento na Fila de Prioridade usamos o removeMin(), ele remove o com menor chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Fila de Prioridade {(5, B), (7, A), (10, C), (14, D)}\r\n"
            			+ "     removeMin() -  Saida{(7, A), (10, C), (14, D)}\r\n"
            			+ "     removeMin() -  Saida{(10, C), (14, D)}\r\n"
            			);
                break;
            case 5:
            	System.out.println("Para consultarmos o tamanho da fila, usamos o size()\r\n"
            			+ "EXEMPLO\n"
            			+ "Fila de Prioridade {(5, B), (7, A), (10, C), (14, D)}\r\n"
            			+ "     size() -  Saida (4)\r\n"
            			);
                break;
                
            case 6:
            	System.out.println("A fila de prioridade sem o heap n�o � eficiente, pois exige que se percorra linearmente a lista\n de elementos para descobrir o local de inser��o ordenada, assim usando o Heap usa os valores\n (k, v) que s�o armazenados numa arvore binaria completa\r\n"
            			+ "\r\n"
            			+ "\r\n"
            			+ "Para adicionarmos um elemento na Fila de Prioridade Heap usamos o insert(k, x), k = chave, x = elemento\r\n"
            			+ "EXEMPLO\n"
            			+ "      Insert(7, A) -  Saida{[(7,A),1]}\r\n"
            			+ "      Insert(14, D) -  Saida{[(7, A),1], [(14, D),2]}\r\n"
            			+ "      Insert(5, B) -  Saida{[(7, A),1], [(14, D),2], [(5, B),3]}\r\n"
            			+ "      Insert(10, C) -  Saida{[(7, A),1], [(14, D),2], [(5, B),3], [(10, C),4]}\r\n"
            			+ "\r\n"
            			+ "Para removermos um elemento na Fila de Prioridade usamos o removeMin(), ele remove o com menor chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Fila de Prioridade {(7, A), (14, D), (5, B), (10, C)}\r\n"
            			+ "     removeMin() -  Saida{[(7, A),1], [(14, D),2], [(10, C),3]}\r\n"
            			+ "     removeMin() -  Saida{[(10, C),1], [(14, D),2]}\r\n"
            			);
                break;
  
            default: 
                break;
        }
    }
}

