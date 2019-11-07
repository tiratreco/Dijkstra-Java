package menu;
import grafo.*;
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
		grafo.addAresta(new Aresta(5, grafo.getVertice(1),grafo.getVertice(2)));
		grafo.addAresta(new Aresta(5, grafo.getVertice(2),grafo.getVertice(3)));
		grafo.addAresta(new Aresta(5, grafo.getVertice(0),grafo.getVertice(3)));
		desenhar = new Desenhar(grafo);
	}
}
