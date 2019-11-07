package grafo;

import java.util.ArrayList;

public class Aresta {
	private int tamanho;
	private Vertice verticeA;
	private Vertice verticeB;
	
	public Aresta(int tamanho, Vertice verticeA, Vertice verticeB) {
		this.tamanho = tamanho;
		this.verticeA = verticeA;
		this.verticeB = verticeB;
	}
	/*public ArrayList<Vertice> getVertices() {
		ArrayList<Vertice> vertices = new ArrayList();
		vertices.add(verticeA);
		vertices.add(verticeB);
		return vertices;
	}*/
	public int getTamanho() {
		return tamanho;
	}
	public int getVerticeA() {
		return verticeA.getNumero();
	}
	public int getVerticeB() {
		return verticeB.getNumero();
	}
	public Vertice getVerticeA1() {
		return verticeA;
	}
	public Vertice getVerticeB1(){
		return verticeB;
	}
}
