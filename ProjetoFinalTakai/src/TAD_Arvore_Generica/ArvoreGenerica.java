package TAD_Arvore_Generica;

import java.util.Scanner;

import SelecionadorDeEstruturasDeDados.Selecionavel;

public class ArvoreGenerica implements Selecionavel {

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
            System.out.println("1. Explicação do tipo ArvoreGenerica");
            System.out.println("2. Explicação de criação na ArvoreGenerica");
            System.out.println("3. Desenho da ArvoreGenerica");
   ;

            Scanner entrada = new Scanner(System.in);
            selecionador = entrada.nextShort();

            selecionarOpcao(selecionador);
        } while (selecionador != 0 && selecionador <= 3);
        
    }

    void selecionarOpcao(short selecionador){
        switch (selecionador) {
            case 0:
                System.out.println("ArvoreGenerica encerrado");
                break;
            case 1:
            	System.out.println("Arvore uma estrutura de dados não linear, que permite implementação de uma serie de\n algoritmos muito mais rápidos do que estrutura linear, como as listas\r\n"
            			+ "Armazena elementos de maneira hierárquica, excerto o topo, seus elementos têm um pai, e\n zero ou mais filhos\r\n"
            			+ "");
                break;
            case 2:
            	System.out.println("Criar Arvore, primeiro o Topo addRoot\r\n"
            			+ "T.addRoot(“Concessionaria”)\r\n"
            			+ "\r\n"
            			+ "Criar os filhos\r\n"
            			+ "criarFilho(raiz, “Bugs”)\r\n"
            			+ "v = criarFilho(raiz, “Carros”)\r\n"
            			+ "criarFilho(raiz, “Triciculo”)\r\n"
            			+ "m = criarFilho(raiz, “Motos”)\r\n"
            			+ "\r\n"
            			+ "Criar filho de V\r\n"
            			+ "i = criarFilho(v, “Volkswagen”)\r\n"
            			+ "criarFilho(v, “Chevrolet”)\r\n"
            			+ "\r\n"
            			+ "Criar Filhos de i\r\n"
            			+ "criarFilho(i, “Jetta”)\r\n"
            			+ "criarFilho(i, “Golf”)\r\n"
            			+ "u = criarFilho(i, “Voyage”)\r\n"
            			+ "\r\n"
            			+ "Criar filhos de U\r\n"
            			+ "criarFilho(u, “G4”)\r\n"
            			+ "criarFilho(u, “G5”)\r\n"
            			+ "criarFilho(u, “G6”)\r\n"
            			+ "\r\n"
            			+ "Criar Filhos de M\r\n"
            			+ "criarFilho(m, “xj6”)\r\n"
            			+ "criarFilho(m, “s1000”)\r\n"
            			+ "criarFilho(m, “hornet”)\r\n"
            			+ "\r\n"
            			+ "irá imprimir [Concessionaria, Carros, Vans, Volkswagen, Jetta, Golf, Voyage, G4, G5, G6, Chevrolet, Triciculo, Motos, XJ6, S1000, Hornet]\r\n"
            			);
                break;
            case 3:
            	System.out.println(" \n						Concessionaria											\n"
            			+ ""
            			+ "\n  /			           /				\\				       \\						\n"
            			+ "\nBugs				Carros				Triciculo				Motos					\n"
            			+ ""
            			+ "\n			      /        \\				                            /     |     \\						\n"
            			+ "\n			Volkswagen  Chevrolet							XJ6    S1000   Hornet	\n"
            			+ ""
            			+ "\n		       /    |    \\				                         		\n"
            			+ "\n	            Jetta  Golf  Voyage													\n"
            			+ ""
            			+ "\n		                /    |    \\				                         		\n"
            			+ "\n			       G4    G5    G6												\n"
            		);
                break;
           
            default: 
                break;
        }
    }
}
