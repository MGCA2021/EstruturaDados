package TAD_Mapa_Ordenado_AVL;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class MapaOrdenadoAVL implements Selecionavel {

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
            System.out.println("1. Explicação do tipo MapaOrdenadoAVL");
            System.out.println("2. Explicação da inserção no MapaOrdenadoAVL");
            System.out.println("3. Explicação de consulta no MapaOrdenadoAVL");
            System.out.println("4. Explicação da remoção no MapaOrdenadoAVL");
            System.out.println("5. Desenho MapaOrdenadoAVL");
            
            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 5);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("MapaOrdenadoAVL encerrado");
                break;
            case 1:
            	System.out.println("\nA correção se resume em acrescentar uma regra (propriedade) à definição de árvore binária de \npesquisa que irá manter uma altura “balanceada”.\r\n"
            			+ "Propriedade da altura/balanceamento: para cada nodo interno v de uma árvore binária de \nbusca, T, as alturas dos filhos de v podem variar em no máximo 1.\r\n"
            			);
                break;
            case 2:
            	System.out.println("Para adicionarmos um elemento no Mapa, usamos o put(k, v) k = chave, v= valor\r\n"
            			+ "EXEMPLO\n"
            			+ "      put(56, 56) – Saida [56]\r\n"
            			+ "      put(49, 49) – Saida [49, 56]\r\n"
            			+ "      put(17, 17) – Saida [17, 49, 56]\r\n"
            			+ "      put(89, 89) – Saida [17, 49, 56, 89]\r\n"
            			+""
            			+ "\n              49                                \n"
            			+ "\n           /     \\                \n"
            			+ "\n         17         56            \n"
            			+ "\n                      \\          \n"
            			+ "\n                       89        \n"
            			+ "\n                               \n"
            			);
                break;
            case 3:
            	System.out.println("Para fazermos uma consulta no Mapa, usamos o get(k), informamos a chave k, e retorna o valor\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa AVL {(17, 17), (49, 49), (56, 56), (89, 89)}\r\n"
            			+ "     Get(49) – Saida (49)\r\n"
            			+ "     Get(89) – Saida (89)\r\n"
            			+ "     Get(81) – Saida (null)\r\n"
            			);
                break;
            case 4:
            	System.out.println("Para removermos um elemento no Mapa, usamos o remove(k), k = chave\r\n"
            			+ "EXEMPLO\n"
            			+ "Mapa AVL {(17, 17), (49, 49), (56, 56), (89, 89)}\r\n"
            			+ "      Remove(56) – Saida [17, 49, 89]\r\n"
            			+ "      Remove(89) – Saida [17, 49]\r\n"
            			);
                break;
            case 5:
            	System.out.println("\nDESENHO MAPA_AVL INSERINDO NESSA ORDEM[2,5,8,6]\n"
            			+ "\n              5                                \n"
            			+ "\n           /     \\                \n"
            			+ "\n         2         8            \n"
            			+ "\n                 /             \n"
            			+ "\n               6               \n"
            			+ "\n                               \n"
            			+ "\nCASO INSERIR [10]                           \n"
            			+ "\n              5                                \n"
            			+ "\n           /     \\                \n"
            			+ "\n         2         8            \n"
            			+ "\n                 /   \\          \n"
            			+ "\n               6       10        \n"
            			+ "\n                               \n"
            			+"CASO REMOVER[8]"
            			+ "\n              5                                \n"
            			+ "\n           /     \\                \n"
            			+ "\n         2         10            \n"
            			+ "\n                 /             \n"
            			+ "\n               6               \n"
            			+ "\n                               \n"
            			);
                break;	
            default: 
                break;
        }
    }
}
