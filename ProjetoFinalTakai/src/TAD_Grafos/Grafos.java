package TAD_Grafos;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class Grafos implements Selecionavel {

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
            System.out.println("1. Explica��o do tipo Grafos");
            System.out.println("2. Explica��o dos metodos Grafos");
         

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 2);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Grafos encerrado");
                break;
            case 1:
            	System.out.println("Um grafo � uma forma de representar relacionamentos que existem\r\n"
            			+ "entre pares de objetos, chamados de v�rtices, juntamente com uma\r\n"
            			+ "cole��o de conex�es entre pares de v�rtices.\r\n"
            			);
                break;
            case 2:
            	System.out.println("Os m�todos do Grafo s�o:\r\n"
            			+ "vertices():\r\n"
            			+ "Retorna uma cole��o iter�vel de todos os v�rtices do grafo.\r\n"
            			+ "\r\n"
            			+ "edges():\r\n"
            			+ "Retorna uma cole��o iter�vel de todas as arestas do grafo.\r\n"
            			+ "\r\n"
            			+ "incidentEdges(v):\r\n"
            			+ "Retorna uma cole��o das arestas incidentes sob o nodo v.\r\n"
            			+ "\r\n"
            			+ "opposite(v,e):\r\n"
            			+ "Retorna o nodo final da aresta e oposto ao nodo v; um erro ocorre se e n�o � incidente a v.\r\n"
            			+ "\r\n"
            			+ "endVertices(e):\r\n"
            			+ "Retorna um arranjo armazenando os v�rtices finais da aresta e.\r\n"
            			+ "\r\n"
            			+ "areAdjacent(v,w):\r\n"
            			+ "Testa se os v�rtices v e w s�o adjacentes.\r\n"
            			+ "\r\n"
            			+ "replace(v,x):\r\n"
            			+ "Substitui o elemento armazenado no nodo v com x.\r\n"
            			+ "\r\n"
            			+ "replace(e, x):\r\n"
            			+ "Substitui o elemento armazenado na aresta e com x.\r\n"
            			+ "\r\n"
            			+ "insertVertex(x):\r\n"
            			+ "Insere e retorna um novo nodo armazenando o elemento x.\r\n"
            			+ "\r\n"
            			+ "insertEdge(v,w,x):\r\n"
            			+ "Insere e retorna uma nova aresta n�o dirigida (v, w) e armazena o elemento x.\r\n"
            			+ "\r\n"
            			+ "removeVertex(v):\r\n"
            			+ "Remove o v�rtice v e todas as arestas incidentes e retorna o elemento armazenado em v.\r\n"
            			+ "\r\n"
            			+ "removeEdge(e):\r\n"
            			+ "Remove a aresta e e retorna o elemento armazenado em e.\r\n"
            			+ "");
                break;
       
            default: 
                break;
        }
    }
}
