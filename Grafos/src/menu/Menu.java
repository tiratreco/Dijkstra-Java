package menu;
import grafo.*;
import java.util.Scanner;

public class Menu {
	static int opcao;
	static Scanner ler = new Scanner(System.in);
	static public void menu(Grafo grafo) {
		System.out.println("-- MENU --");
		System.out.println("1 - Novo Vertice");
		System.out.println("2 - Nova Aresta");
		System.out.println("3 - Novo Grafo");
		System.out.println("\n");
		System.out.println("\n");
		opcao = ler.next().charAt(0);
	}
	
}