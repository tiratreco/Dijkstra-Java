package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Vertice {
	private int numero;
	private int distancia;
	
	public Vertice(int numero) {
		this.numero = numero;
		distancia=99999999;
	}
	public int getNumero() {
		return numero;
	}
	public void novaDistancia(int distancia) {
		if(distancia<this.distancia) {
			this.distancia=distancia;
		}
	}
	public int getDistancia() {
		return distancia;
	}
}
