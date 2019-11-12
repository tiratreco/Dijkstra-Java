package menu;
import grafo.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {
	public static Grafo lerArquivo(String nomeArquivo) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(nomeArquivo));
        Grafo grafo;
        String dado;
        String dados[] = new String[3];
        int tamanho;
        dado = ler.nextLine();
		grafo = new Grafo(new Vertice(dado));
		dado = ler.nextLine();
		while(!(dado.length()==0)) {
        	grafo.addVertice(new Vertice(dado));
        	dado = ler.nextLine();
        }
		while(ler.hasNextLine()) {
			dado = ler.nextLine();
			dados = dado.split(" ");
			tamanho = Integer.parseInt(dados[0]);
			grafo.addAresta(new Aresta(tamanho, grafo.procurarVertice(dados[1]), grafo.procurarVertice(dados[2])));
        }
		ler.close();
       return grafo;
    }
} 
