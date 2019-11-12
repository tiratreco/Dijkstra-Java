package menu;
import grafo.Dijkstra;
import grafo.*;
import java.io.FileNotFoundException;
import desenhar.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Grafo grafo;
		String inicio; String fim; String arquivo;
		Scanner ler = new Scanner(System.in);
		System.out.print("Nome do arquivo do grafo: ");
		arquivo = ler.nextLine();
		try {
			grafo = Arquivo.lerArquivo(arquivo);
			new Desenhar(grafo);
			Grafo menorCaminho;
			System.out.print("Digite o nome do vertice inicial: ");
			inicio = ler.nextLine();
			System.out.print("Digite o nome do vertice final: ");
			fim = ler.nextLine();
			menorCaminho=Dijkstra.dijkstra(grafo, grafo.procurarVertice(inicio), grafo.procurarVertice(fim));
			new Desenhar(menorCaminho, menorCaminho.getTamanhoMinimo());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
	}
}
