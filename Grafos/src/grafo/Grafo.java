package grafo;
import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {
	private ArrayList<Vertice> vertices;
	private ArrayList<Aresta> arestas;
	
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
		if(existeVertice(aresta.getVerticeA()) && existeVertice(aresta.getVerticeB()))
			arestas.add(aresta);
	}

	private Vertice procurarVertice(int codigo) {
		for(Vertice v: vertices) {
			if(v.getNumero()==codigo)
				return v;
		}
		return null;
	}
	public int numeroArestas() {
		return arestas.size();
	}
	private boolean existeVertice(int codigo) {
		for(Vertice v: vertices) {
			if(v.getNumero()==codigo)
				return true;
		}
		return false;
	}
	public ArrayList<Vertice> vertices (){
		return vertices;
	}
	public ArrayList<Aresta> arestas(){
		return arestas;
	}
	public Vertice getVertice(int num) {
		return vertices.get(num);
	}
	public void imprimirDistancias() {
		for(Vertice v: vertices) {
			System.out.println("Vertice "+ v.getNumero() + " Distancia = " + v.getDistancia());
		}
	}
}