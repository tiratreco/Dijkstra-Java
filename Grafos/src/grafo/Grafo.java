package grafo;
import java.util.ArrayList;

public class Grafo {
	ArrayList<Vertice> vertices;
	ArrayList<Aresta> arestas;
	
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
	private ArrayList<Vertice> verticesLigados(Vertice v){
		ArrayList<Vertice> vertices = new ArrayList();
		for(Aresta a: arestas) {
			if(v == a.getVerticeA1())
				vertices.add(a.getVerticeB1());
			if(v == a.getVerticeB1())
				vertices.add(a.getVerticeA1());
		}
		return vertices;
	}

}