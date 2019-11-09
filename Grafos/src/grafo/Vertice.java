package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Vertice {
	private int numero;
	private int distancia;
	private Vertice vem;
	
	public Vertice(int numero) {
		this.numero = numero;
		distancia=99999999;
		vem=null;
	}
	public int getNumero() {
		return numero;
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
