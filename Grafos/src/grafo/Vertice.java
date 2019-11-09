package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Vertice {
	private String nome;
	private int distancia;
	private Vertice vem;
	
	public Vertice(String nome) {
		this.nome = nome;
		distancia=99999999;
		vem=null;
	}
	public String getNome() {
		return nome;
	}
	public void novaDistancia(int distancia, Vertice vem) {
		if(distancia<this.distancia) {
			this.distancia=distancia;
			this.vem=vem;
		}
	}
	public int getDistancia() {
		return distancia;
	}
	public Vertice getAnterior() {
		return vem;
	}
}
