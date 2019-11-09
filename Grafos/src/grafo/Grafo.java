package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {
	private ArrayList<Vertice> vertices;
	private ArrayList<Aresta> arestas;
	private int tamanhoMinimo;

	public Aresta getAresta(int indice) {
		return arestas.get(indice);
	}

	public Grafo(Vertice vertice) {
		vertices = new ArrayList<Vertice>();
		arestas = new ArrayList<Aresta>();
		vertices.add(vertice);
	}

	public void addVertice(Vertice vertice) {
		vertices.add(vertice);
	}

	public void addAresta(Aresta aresta) {
		if (existeVertice(aresta.getVerticeA()) && existeVertice(aresta.getVerticeB()))
			arestas.add(aresta);
	}

	public Vertice procurarVertice(String nome) {
		for (Vertice v : vertices) {
			if (v.getNome() == nome)
				return v;
		}
		return null;
	}

	public int numeroArestas() {
		return arestas.size();
	}

	private boolean existeVertice(String nome) {
		for (Vertice v : vertices) {
			if (v.getNome() == nome)
				return true;
		}
		return false;
	}

	public ArrayList<Vertice> vertices() {
		return vertices;
	}

	public ArrayList<Aresta> arestas() {
		return arestas;
	}

	public Vertice getVertice(int num) {
		return vertices.get(num);
	}

	public void imprimirDistancias() {
		for (Vertice v : vertices) {
			System.out.println("Vertice " + v.getNome() + " Distancia = " + v.getDistancia());
		}
	}

	public Aresta ligacao(Vertice v1, Vertice v2) {
		for (Aresta a : arestas) {
			if ((a.getVerticeA1() == v1 && a.getVerticeB1() == v2)
					|| (a.getVerticeA1() == v2 && a.getVerticeB1() == v1)) {
				return a;
			}
		}
		return null;
	}

	public void setTamanhoMinimo(int tamanhoMinimo) {
		this.tamanhoMinimo = tamanhoMinimo;
	}

	public int getTamanhoMinimo() {
		return tamanhoMinimo;
	}
}