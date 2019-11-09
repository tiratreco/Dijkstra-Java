package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {
	static public void colocarDistancias(Grafo grafo, ArrayList<Vertice> visitados) {
		ArrayList<Vertice> vertices = grafo.vertices();
		Vertice vertice;
		for (Aresta a : grafo.arestas()) {
			for (Vertice v : visitados) {
				if (a.getVerticeA() == v.getNumero() && !visitados.contains(a.getVerticeB())) {
					vertice = a.getVerticeB1();
					vertice.novaDistancia(a.getTamanho() + v.getDistancia(), v);
				} else if (a.getVerticeB() == v.getNumero() && !visitados.contains(a.getVerticeA())) {
					vertice = a.getVerticeA1();
					vertice.novaDistancia(a.getTamanho() + v.getDistancia(), v);
				}
			}
		}
	}

	static public Vertice menorDistancia(Grafo grafo, ArrayList<Vertice> visitados) {
		int menor = 999999;
		Vertice menorVertice = null;
		for (Vertice v : grafo.vertices()) {
			if (v.getDistancia() < menor && !visitados.contains(v)) {
				menorVertice = v;
				menor = v.getDistancia();
			}
		}
		return menorVertice;
	}

	static public Grafo dijkstra(Grafo grafo, Vertice verticeInicial, Vertice verticeFinal) {
		ArrayList<Vertice> visitados = new ArrayList();
		Vertice vertice;
		vertice = verticeInicial;
		visitados.add(vertice);
		vertice.novaDistancia(0, null);

		while (!visitados.contains(verticeFinal)) {
			colocarDistancias(grafo, visitados);
			visitados.add(menorDistancia(grafo, visitados));
		}
		System.out.println("Distancia minima: " + verticeFinal.getDistancia());
		//System.out.println("Vem: " + verticeFinal.getAnterior().getDistancia());
		Grafo menorCaminho = new Grafo(grafo.getVertice(0));
		for (Vertice v : grafo.vertices()) {
			if (v != grafo.getVertice(0)) {
				menorCaminho.addVertice(v);
			}
		}
		Vertice ver;
		ver = verticeFinal;
		while (ver != verticeInicial) {
			if (grafo.ligacao(ver, ver.getAnterior()) != null) {
				menorCaminho.addAresta(grafo.ligacao(ver, ver.getAnterior()));
				ver = ver.getAnterior();
			}
		}
		menorCaminho.setTamanhoMinimo(verticeFinal.getDistancia());
		return menorCaminho;
	}
}