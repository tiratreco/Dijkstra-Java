package menu;
import grafo.Dijkstra;
import grafo.*;
import java.util.ArrayList;
import desenhar.*;

public class Principal {

	public static void main(String[] args) {
		Vertice vertice = new Vertice("A");
		Grafo grafo = new Grafo(vertice);
		Aresta aresta;
		vertice = new Vertice("B");
		grafo.addVertice(vertice);
		vertice = new Vertice("C");
		aresta = new Aresta(10, grafo.getVertice(0), grafo.getVertice(1));
		grafo.addAresta(aresta);
		grafo.addVertice(vertice);
		vertice = new Vertice("D");
		grafo.addVertice(vertice);
		grafo.addVertice(new Vertice("E"));
		grafo.addVertice(new Vertice("F"));
		grafo.addAresta(new Aresta(5, grafo.getVertice(1),grafo.getVertice(3)));
		grafo.addAresta(new Aresta(2, grafo.getVertice(0),grafo.getVertice(2)));
		//grafo.addAresta(new Aresta(9, grafo.getVertice(4),grafo.getVertice(0)));
		//grafo.addAresta(new Aresta(5, grafo.getVertice(2),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(8, grafo.getVertice(2),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(5, grafo.getVertice(0),grafo.getVertice(3)));
		//grafo.addAresta(new Aresta(7, grafo.getVertice(1),grafo.getVertice(4)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(1),grafo.getVertice(2)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(3),grafo.getVertice(4)));
		grafo.addAresta(new Aresta(7, grafo.getVertice(2),grafo.getVertice(4)));
		new Desenhar(grafo);
		Grafo menorCaminho;
		menorCaminho=Dijkstra.dijkstra(grafo, grafo.getVertice(4), grafo.getVertice(1));
		new Desenhar(menorCaminho, menorCaminho.getTamanhoMinimo());
	}
}
