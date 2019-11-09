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
	public int getTamanho() {
		return tamanho;
	}
	public String getVerticeA() {
		return verticeA.getNome();
	}
	public String getVerticeB() {
		return verticeB.getNome();
	}
	public Vertice getVerticeA1() {
		return verticeA;
	}
	public Vertice getVerticeB1(){
		return verticeB;
	}
}
