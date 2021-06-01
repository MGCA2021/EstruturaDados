package TAD_Dicionario;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class Dicionario implements Selecionavel {

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
            System.out.println("1. Explicação do tipo Dicionario");
            System.out.println("2. Explicação da inserção no Dicionario");
            System.out.println("3. Explicação da consulta no Dicionario");
            System.out.println("4. Explicação da remoção no Dicionario");
            

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 4);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Dicionario encerrado");
                break;
            case 1:
            	System.out.println("\nComo mapas, os Dicionarios armazenam pares chave-valor(k,v), ao contrário de mapas,\n dicionários podem ter múltiplas entradas com a mesma chave\n");
                break;
            case 2:
            	System.out.println("Para adicionarmos um elemento no Dicionario, usamos o put(k, v) k = chave, v = valor\r\n"
            			+ "EXEMPLO\n"
            			+ "      put(3, A) – Saida {(3, A)}\r\n"
            			+ "      put(6, B) – Saida {(3, A), (6,B)}\r\n"
            			+ "      put(9, C) – Saida {(3, A), (6,B), (9,C)}\r\n"
            			+ "      put(7, D) – Saida {(3, A), (6,B), (9,C), (7,D)}\r\n"
            			+ "      put(9, E) – Saida {(3, A), (6,B), (9,C), (7,D), (9,E)}\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para farmos uma consulta no Dicionario, usamos o get(k), informamos a chave k, e retorna o valor\r\n"
            			+ "EXEMPLO\n"
            			+ "Dicionario {(3, A), (6,B), (9,C), (7,D), (9,E)}\r\n"
            			+ "     Get(6) – Saida (6,B)\r\n"
            			+ "     Get(7) – Saida (7,D)\r\n"
            			+ "     GetAll(9) – Saida ((9,C), (9,E))\r\n"
            			);
                break;
            case 4:
            	System.out.println("Para removermos um elemento no Dicionario, usamos o remove(k), k = chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa {(3, A), (6,B), (9,C), (7,D), (9,E)}\r\n"
            			+ "      Remove(Get(9)) – Saida {(3, A), (6,B), (7,D), (9,E)}\r\n"
            			+ "      Remove(Get(3)) – Saida {(6,B), (7,D), (9,E)}\r\n"
            			);
                break;
            
            default: 
                break;
        }
    }
}