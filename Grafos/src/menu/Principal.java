package menu;
import grafo.Dijkstra;
import grafo.*;
import java.util.ArrayList;
import desenhar.*;

public class Principal {

	public static void main(String[] args) {
		Vertice vertice = new Vertice(1);
		Grafo grafo = new Grafo(vertice);
		Aresta aresta;
		Desenhar desenhar;
		vertice = new Vertice(2);
		grafo.addVertice(vertice);
		vertice = new Vertice(3);
		aresta = new Aresta(10, grafo.getVertice(0), grafo.getVertice(1));
		grafo.addAresta(aresta);
		grafo.addVertice(vertice);
		vertice = new Vertice(4);
		grafo.addVertice(vertice);
		grafo.addVertice(new Vertice(5));
		grafo.addAresta(new Aresta(5, grafo.getVertice(1),grafo.getVertice(3)));
		grafo.addAresta(new Aresta(2, grafo.getVertice(0),grafo.getVertice(2)));
		grafo.addAresta(new Aresta(9, grafo.getVertice(4),grafo.getVertice(0)));
		grafo.addAresta(new Aresta(5, grafo.getVertice(2),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(8, grafo.getVertice(2),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(5, grafo.getVertice(0),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(7, grafo.getVertice(1),grafo.getVertice(4)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(1),grafo.getVertice(2)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(3),grafo.getVertice(4)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(2),grafo.getVertice(4)));
		desenhar = new Desenhar(grafo);
		ArrayList<Vertice> visitados = new ArrayList();
		visitados.add(grafo.getVertice(0));
		vertice=grafo.getVertice(0);
		vertice.novaDistancia(0);
		Dijkstra.colocarDistancias(grafo, visitados);
		grafo.imprimirDistancias();
		visitados.add(grafo.getVertice(1));
		Dijkstra.colocarDistancias(grafo, visitados);
		grafo.imprimirDistancias();
	}
}
