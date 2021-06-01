package TAD_Lista_Arranjo;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class ListaArranjo implements Selecionavel {

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
            System.out.println("1. Explica��o do tipo Lista Arranjo");
            System.out.println("2. Explica��o da inser��o na Lista Arranjo");
            System.out.println("3. Explica��o da remo��o na Lista Arranjo");
            System.out.println("4. Explica��o de substitui��o na Lista Arranjo");
            System.out.println("5. Explica��o de pesquisa na Lista Arranjo");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 5);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Lista Arranjo encerrado");
                break;
            case 1:
    			System.out.println("\nListas Arranjo � muito flex�vel e pode acomodar inser��o e retirada de dados de locais arbitr�rios,\r\n"
    					+ "A lista pode ser percorrida em qualquer dire��o,\r\n"
    					+ "a inser��o de um novo item no meio da lista requer um deslocamento de todos os itens\r\n"
    					+ "localizados ap�s o ponto de inser��o,\r\n"
    					+ "onde armazena N elementos, armazenando em uma \r\n"
    					+ "certa ordem linear, onde � poss�vel se referir aos elementos da lista como 1,2,3...\r\n"
    					+ "o 1 elemento da lista tem �ndice = 0 e �ltimo n -1\r\n"
    					+ "retirar um item do in�cio da lista requer um deslocamento de itens para preencher o espa�o\n"
    					+ "deixado vazio.");

                break;
            case 2:
            	System.out.println("Para Adicionarmos um elemento na fila, usamos o add(i, e) onde informamos o i = �ndice, e = elemento\r\n"
            			+ "EXEMPLO\n"
            			+ "        add(0, 10) � Saida (10)\r\n"
            			+ "        add(1, 8) � Saida (10, 8)\r\n"
            			+ "        add(2, 12) � Saida (10, 8, 12)\r\n"
            			+ "        add(1, 6) � Saida (10, 6, 8, 12)\r\n"
            			+ "\nOBS � Ocorrera um erro caso o i (indice) for menor que 0 ou �ndice maior que o tamanho -1\r\n");

                break;
            case 3:
                System.out.println("Para Removermos um elemento na fila, usamos o remove(i) onde informamos o i = �ndice apenas\r\n"
                		+ "EXEMPLO\n"
                		+ "Lista = (10, 6, 8, 12)\r\n"
                		+ "        Remove(2) - Saida (10, 6, 12)\r\n"
                		+ "        Remove(2) - Saida (10, 6)\r\n"
                		+ "\nOBS � Ocorrera um erro caso o i (indice) for menor que 0 ou �ndice maior que o tamanho -1\r\n"
                		);
                break;
            case 4:
            	System.out.println("Para Retornar um elemento na fila, usamos o Get(i) onde informamos o i = �ndice apenas\r\n"
            			+ "EXEMPLO\n"
            			+ "Lista = (10, 6, 8, 12)\r\n"
            			+ "        Get(2) - Saida (8)\r\n"
            			+ "        Get(0) - Saida (10)\r\n"
            			+ "\nOBS � Ocorrera um erro caso o i (indice) for menor que 0 ou �ndice maior que o tamanho -1\r\n"
            			);
            	break;
            case 5:
            	System.out.println("Na Lista Arranjo � poss�vel at� mesmo substituir um elemento por outro, usamos o Set(i, e), informando um i = �ndice existente, e o e = elemento\r\n"
            			+ "EXEMPLO\n"
            			+ "Lista = (10, 6, 8, 12)\r\n"
            			+ "        Set(3, 26) - Saida (10, 6, 8, 26)\r\n"
            			+ "        Set(1, 15) ) - Saida (10, 15, 8, 26)\r\n"
            			);
            	break;
            default: 
                break;
        }
    }
}
