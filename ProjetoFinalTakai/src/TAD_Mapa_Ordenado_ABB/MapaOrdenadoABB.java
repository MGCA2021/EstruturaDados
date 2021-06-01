package TAD_Mapa_Ordenado_ABB;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class MapaOrdenadoABB implements Selecionavel {

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
            System.out.println("1. Explicação do tipo MapaOrdenadoABB");
            System.out.println("2. Explicação da inserção no MapaOrdenadoABB");
            System.out.println("3. Explicação de consulta no MapaOrdenadoABB");
            System.out.println("4. Explicação da remoção no MapaOrdenadoABB");
            System.out.println("5. Desenho MapaOrdenadoABB");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 4);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("MapaOrdenadoABB encerrado");
                break;
            case 1:
            	System.out.println("\nA Estrutura de Mapa fornece um jeito que permite armazenar elementos que podem ser\n localizados rapidamente usando chaves.\r\n"
            			+ "As árvores de pesquisa são árvores que podem implementar mapas, ABB, são excelentes para\n armazenar elementos num mapa, assumindo as chaves possuam uma relação de ordem.\r\n"
            			+ "O desempenho do TAD Mapa Ordenado – Árvore Binária de Busca, é melhor do que o TAD Mapa.\r\n"
            			);
                break;
            case 2:
            	System.out.println("Para adicionarmos um elemento no Mapa, usamos o put(k, v) k = chave, v= valor\r\n"
            			+ "EXEMPLO\n"
            			+ "      put(2, 2) – Saida [2]\r\n"
            			+ "      put(5, 5) – Saida [2, 5]\r\n"
            			+ "      put(17, 17) – Saida [2, 5, 17]\r\n"
            			+ "      put(9, 9) – Saida [2, 5, 9, 17]\r\n"
            			);
                break;
            case 3:
            	System.out.println("Para farmos uma consulta no Mapa, usamos o get(k), informamos a chave k, e retorna o valor\r\n"
            			+ "EXEMPLO\n"
            			+ " Mapa ABB {(2, 2), (5, 5), (9, 9), (17, 17)}\r\n"
            			+ "     Get(5) – Saida (5)\r\n"
            			+ "     Get(9) – Saida (9)\r\n"
            			+ "     Get(8) – Saida (null)\r\n"
            			);
                break;
            case 4:
            	System.out.println("Para removermos um elemento no Mapa, usamos o remove(k), k = chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa ABB{(2, 2), (5, 5), (9, 9), (17, 17)}\r\n"
            			+ "      Remove(9) – Saida [2, 5, 17]\r\n"
            			+ "      Remove(2) – Saida [5, 17]\r\n"
            			);
                break;
        
            case 5:
            	System.out.println("\nDESENHO MAPA_ABB INSERINDO NESSA ORDEM[2,5,8,6]\n"
            			+ "\n               2                                \n"
            			+ "\n                 \\                \n"
            			+ "\n                   5            \n"
            			+ "\n                      \\             \n"
            			+ "\n                        8      \n"
            			+ "\n                      /          \n"
            			+ "\n                    6          \n"
            			+"CASO INSERIR[1]"
            			+ "\n               2                                \n"
            			+ "\n             /   \\                \n"
            			+ "\n           1       5            \n"
            			+ "\n                      \\             \n"
            			+ "\n                        8      \n"
            			+ "\n                      /          \n"
            			+ "\n                    6          \n"
            			+"CASO REMOVER[5]"
            			+ "\n               2                                \n"
            			+ "\n            /    \\                \n"
            			+ "\n          1        8            \n"
            			+ "\n                  /                 \n"
            			+ "\n                6             \n"
            			+ "\n                                \n"
            			
            			);
            default: 
                break;
        }
    }
}
