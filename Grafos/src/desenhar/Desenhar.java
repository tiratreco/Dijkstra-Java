package desenhar;

import grafo.*;
import java.math.*;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Desenhar extends JFrame {
	private Grafo grafo;
	private int raio = 200;
	private int xBase = 500;
	private int yBase = 400;
	private int menorCaminho;
	private int tamanhoBolinha = 10;

	public Desenhar(Grafo grafo) {
		setSize(1200, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.grafo = grafo;
		menorCaminho = -1;
	}
	public Desenhar(Grafo grafo, int menorCaminho) {
		setSize(1200, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.grafo = grafo;
		this.menorCaminho = menorCaminho;
	}

	public void paint(Graphics g) {
		// g.drawOval(xBase, yBase, 10, 10);//centro
		ArrayList<Vertice> vertices = grafo.vertices();
		ArrayList<Aresta> arestas = grafo.arestas();
		ArrayList<Integer> posicaoX = new ArrayList();
		ArrayList<Integer> posicaoY = new ArrayList();
		ArrayList<String> nomes = new ArrayList();
		Vertice vertice;
		int contador;
		contador = 0;
		int x, y;
		//imprimir vertices
		//rad=180/pi
		do {
			x = xBase + (int) Math.round(raio * Math.cos(Math.PI*2/vertices.size()*contador));
			y = yBase + (int) Math.round(raio * Math.sin(Math.PI*2/vertices.size()*contador));
			posicaoX.add(x);
			posicaoY.add(y);
			vertice = vertices.get(contador);
			nomes.add(vertice.getNome());
			g.drawOval(x, y, tamanhoBolinha, tamanhoBolinha);
			g.fillOval(x, y, tamanhoBolinha, tamanhoBolinha);
			g.drawString(vertice.getNome(), x + 3, y - 5);
			contador++;
		} while (contador != vertices.size());
		// imprimir arestas
		contador = 0;
		int i, j;
		for (Aresta a : arestas) {
			for (i = 0; i < nomes.size(); i++) {
				for (j = 0; j < nomes.size(); j++) {
					if (a.getVerticeA() == nomes.get(i) && a.getVerticeB() == nomes.get(j)) {
						g.drawLine(posicaoX.get(i) + 5, posicaoY.get(i) + 5, posicaoX.get(j) + 5, posicaoY.get(j) + 5);
						g.drawString(String.valueOf(a.getTamanho()), (posicaoX.get(i) + posicaoX.get(j)) / 2,
								(((posicaoY.get(i) - posicaoY.get(j)) / 2) + posicaoY.get(j)));
					}
				}
			}
			contador++;
		}
		if (menorCaminho!=-1) {
			g.drawString("Tamanho Minimo: " + menorCaminho, xBase, yBase + raio + 50);
		}

	}
}