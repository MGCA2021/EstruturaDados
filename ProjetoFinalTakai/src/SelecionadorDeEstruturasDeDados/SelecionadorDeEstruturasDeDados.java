package SelecionadorDeEstruturasDeDados;

import java.util.Scanner;

import TAD_Arvore_Binaria.ArvoreBinaria;
import TAD_Arvore_Generica.ArvoreGenerica;
import TAD_Dicionario.Dicionario;
import TAD_Fila.Fila;
import TAD_Fila_Prioridade.FilaDePrioridade;
import TAD_Grafos.Grafos;
import TAD_Lista_Arranjo.ListaArranjo;
import TAD_Lista_Nodo.ListaDeNodos;
import TAD_Mapa.Mapa;
import TAD_Mapa_Ordenado_ABB.MapaOrdenadoABB;
import TAD_Mapa_Ordenado_AVL.MapaOrdenadoAVL;
import TAD_Pilha.Pilha;

public class SelecionadorDeEstruturasDeDados {

    public static void main(String[] args) {
        inicializarMenu();
    }

    static void inicializarMenu(){
        short selecionador = 0;
        do {
            System.out.println("Selecione uma das seguintes opções: ");
            System.out.println("0. Encerrar Programa");
            System.out.println("1. TAD-Lista Arranjo");
            System.out.println("2. TAD-Pilha");
            System.out.println("3. TAD-Fila");
            System.out.println("4. TAD-Lista de Nodos");
            System.out.println("5. TAD-Árvore Genérica");
            System.out.println("6. TAD-Árvore Binária");
            System.out.println("7. TAD-Fila de Prioridade");
            System.out.println("8. TAD-Mapa");
            System.out.println("9. TAD-Dicionário");
            System.out.println("10. TAD-Mapa Ordenado - ABB");
            System.out.println("11. TAD-Mapa Ordenado - AVL");
            System.out.println("12. TAD-Grafos");

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();
            
            selecionarEstrutura(selecionador);
        } while (selecionador != 0 && selecionador <= 12);

    }

    static void selecionarEstrutura(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("Programa encerrado");
                break;
            case 1:
                new ListaArranjo().inicializarEstrutura();
                break;
            case 2:
                new Pilha().inicializarEstrutura(); 
                break;
            case 3:
                new Fila().inicializarEstrutura(); 
                break;
            case 4:
                new ListaDeNodos().inicializarEstrutura(); 
                break;
            case 5:
                new ArvoreGenerica().inicializarEstrutura();
                break;
            case 6:
                new ArvoreBinaria().inicializarEstrutura();
                break;
            case 7:
                new FilaDePrioridade().inicializarEstrutura(); 
                break;
            case 8:
                new Mapa().inicializarEstrutura();
                break;
            case 9:
                new Dicionario().inicializarEstrutura();
                break;
            case 10:
                new MapaOrdenadoABB().inicializarEstrutura();
                break;
            case 11:
                new MapaOrdenadoAVL().inicializarEstrutura();
                break;
            case 12:
                new Grafos().inicializarEstrutura();
                break;
            default:
                break;
        }
    }
}