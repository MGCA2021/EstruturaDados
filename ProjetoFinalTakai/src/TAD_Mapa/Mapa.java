package TAD_Mapa;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class Mapa implements Selecionavel {

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
            System.out.println("1. Explicação do tipo Mapa");
            System.out.println("2. Explicação da inserção no Mapa");
            System.out.println("3. Explicação de consulta no Mapa");
            System.out.println("4. Explicação da remoção no Mapa");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 4);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Mapa encerrado");
                break;
            case 1:
            	System.out.println("\nA Estrutura de Mapa fornece um jeito que permite armazenar elementos que podem ser\n localizados rapidamente usando chaves, mapa requerer que cada chave seja única,\n a chave pode ser vista como um endereço para um objeto\n");
                break;
            case 2:
            	System.out.println("Para adicionarmos um elemento no Mapa, usamos o put(k, v) k = chave, v= valor\r\n"
            			+ "EXEMPLO\n"
            			+ "      put(3, A) – Saida {(3, A)}\r\n"
            			+ "      put(6, B) – Saida {(3, A), (6,B)}\r\n"
            			+ "      put(9, C) – Saida {(3, A), (6,B), (9,C)}\r\n"
            			+ "      put(7, D) – Saida {(3, A), (6,B), (9,C), (7,D)}\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para fazermos uma consulta no Mapa, usamos o get(k), informamos a chave k, e retorna o valor\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa {(3, A), (6,B), (9,C), (7,D)}\r\n"
            			+ "     Get(6) – Saida (B)\r\n"
            			+ "     Get(9) – Saida (C)\r\n"
            			+ "     Get(15) – Saida (null)\r\n"
            			);
                break;
            case 4:
            	System.out.println("Para removermos um elemento no Mapa, usamos o remove(k), k = chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa {(3, A), (6,B), (9,C), (7,D)}\r\n"
            			+ "      Remove(9) – imprimira {(3, A), (6,B), (7,D)}\r\n"
            			+ "      Remove(3) – imprimira {(6,B), (7,D)}\r\n"
            			);
                break;
           

            default: 
                break;
        }
    }
}
