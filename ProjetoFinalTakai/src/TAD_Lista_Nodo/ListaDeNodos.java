package TAD_Lista_Nodo;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class ListaDeNodos implements Selecionavel {

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
            System.out.println("1. Explicação do tipo ListaDeNodos");
            System.out.println("2. Explicação da inserção na ListaDeNodos");
            System.out.println("3. Explicação da remoção na ListaDeNodos");
            System.out.println("4. Explicação de consulta na ListaDeNodos");
            System.out.println("5. Teste de substituição na ListaDeNodos");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 5);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("ListaDeNodos encerrado");
                break;
            case 1:
            	System.out.println("\nNodo veio para substituir o índice, é uma maneira mais eficiente para identificar onde acessar\n ou atualizar a lista, a ideia é armazenar os elementos em posições que são mantidas\n organizadas em uma ordem linear\n");
                break;
            case 2:
            	System.out.println("Nodo acaba tendo mais métodos, como:\r\n"
            			+ "Para Adicionar temos: AddFirst(e), AddLast(e), e = elemento, AddBefore(e), AddAfter(e), e = elemento, p = position\r\n"
            			+ "EXEMPLO\n"
            			+ "      addFirst(14) – Saida (14)\r\n"
            			+ "      addAfter(p1, 7)– Saida(14, 7)\r\n"
            			+ "      addAfter(p2, 21)  – Saida(14, 7, 21)\r\n"
            			+ "      addBefore(p3, 28) – Saida(14, 7, 28, 21)\r\n"
            			+ "      addLast(49) – Saida(14, 7, 28, 21, 49)\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para Removermos temos: remove(p), p = position\r\n"
            			+ "EXEMPLO\n"
            			+ "Nodo (14, 7, 28, 21, 49)\r\n"
            			+ "        Remove(first()) – Saida(7, 28, 21, 49)\r\n"
            			+ "        Remove(Last())  – Saida(7, 28, 21)\r\n"
            			);
                break;
            case 4:
            	System.out.println("Temos também os métodos de Consultas, first(), last(), next(p), prev(p)\r\n"
            			+ "EXEMPLO\n"
            			+ "Nodo (14, 7, 28, 21, 49)\r\n"
            			+ "        Fisrt() – Saida(14)\r\n"
            			+ "        Last() – Saida(49)\r\n"
            			+ "        Next(p2) – Saida(28)\r\n"
            			+ "        prev(p3) – Saida(7)\r\n"
            			);
                break;
            case 5:
            	System.out.println("Não podemos esquecer o método de Substituir um elemento, Set(p, e)\r\n"
            			+ "EXEMPLO\n"
            			+ "Nodo (14, 7, 28, 21, 49)\r\n"
            			+ "       Set(p3, 5)  – Saida(14, 7, 5, 21, 49)\r\n"
            			);
                break;
            default: 
                break;
        }
    }
}