package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {
	
	static public void colocarDistancias(Grafo grafo, ArrayList<Vertice> visitados) {
		ArrayList<Vertice> vertices = grafo.vertices();
		Vertice vertice;
		for(Aresta a: grafo.arestas()) {
			for(Vertice v: visitados) {
				if(a.getVerticeA()==v.getNumero() && !visitados.contains(a.getVerticeB())) {
					vertice=a.getVerticeB1();
					vertice.novaDistancia(a.getTamanho() + v.getDistancia());
				}
				else if(a.getVerticeB()==v.getNumero() && !visitados.contains(a.getVerticeB())) {
					vertice=a.getVerticeA1();
					vertice.novaDistancia(a.getTamanho() + v.getDistancia());
				}
			}
		}
	}
	
	static public void dijkstra(Grafo grafo, Vertice verticeInicial, Vertice verticeFinal) {
		
	}
}