package desenhar;
import grafo.*;
import java.math.*;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Desenhar extends JFrame{
	private Grafo grafo;
	int raio;
	public Desenhar(Grafo grafo) {	
		setSize(1200, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.grafo = grafo;
		raio = 300;
	}
	
	public void paint(Graphics g) {
		//g.drawOval(500, 400, 10, 10);//centro
		ArrayList<Vertice> vertices = grafo.vertices();
		ArrayList<Aresta> arestas = grafo.arestas();
		ArrayList<Integer> posicaoX = new ArrayList();
		ArrayList<Integer> posicaoY = new ArrayList();
		ArrayList<Integer> codigo = new ArrayList();
		Vertice vertice;
		int contador;
		contador = 0;
		int x, y;
		do {
			x = 500+(int)Math.round(raio*Math.cos(Math.toRadians(360/vertices.size()*contador)));
			y = 400+(int)Math.round(raio*Math.sin(Math.toRadians(360/vertices.size()*contador)));
			posicaoX.add(x);
			posicaoY.add(y);
			vertice = vertices.get(contador);
			codigo.add(vertice.getNumero());
			g.drawOval(x, y, 10, 10);
			g.fillOval(x, y, 10, 10);
			g.drawString(String.valueOf(vertice.getNumero()), x+3, y-5);
			contador++;
		}while(contador!=vertices.size());
		//imprimir arestas
		contador = 0;
		int i, j;
		for(Aresta a: arestas) {
			for(i=0;i<codigo.size();i++) {
				for(j=0;j<codigo.size();j++) {
					if(a.getVerticeA()==codigo.get(i)&&a.getVerticeB()==codigo.get(j)) {
						g.drawLine(posicaoX.get(i)+5, posicaoY.get(i)+5, posicaoX.get(j)+5, posicaoY.get(j)+5);
						g.drawString(String.valueOf(a.getTamanho()), (posicaoX.get(i)+posicaoX.get(j))/2, (((posicaoY.get(i)-posicaoY.get(j))/2)+posicaoY.get(j)));
					}
				}
			}
			contador++;
		}
		
	}
}