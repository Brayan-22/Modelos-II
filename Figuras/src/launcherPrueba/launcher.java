package launcherPrueba;
import figuras.*;
import java.util.ArrayList;
public class launcher {
	private ArrayList<Vertice> vertices;
	public launcher() {
		iniciar();
	}
	
	private void iniciar() {
		//------------PRUEBA CIRCULO------------------
		Figura circulo1 = new Circulo(/*radio*/1.0);
		System.out.println("Area del circulo: "+circulo1.getArea());
		System.out.println("Perimetro del circulo: "+circulo1.getPerimetro());
		//------------PRUEBA POLIGONO-----------------
		this.vertices=new ArrayList<>();
		Vertice vertice1 = new Vertice(-8, 2);
		this.vertices.add(vertice1);
		Vertice vertice2 = new Vertice(-2, -6);
		this.vertices.add(vertice2);
		Vertice vertice3 = new Vertice(7, -1);
		this.vertices.add(vertice3);
		Vertice vertice4 = new Vertice(-1, 5);
		this.vertices.add(vertice4);
		Figura poligono = new Poligono(this.vertices);
		System.out.println("Area del poligono: "+poligono.getArea()+" u^2");
		System.out.println("Perimetro del poligono: "+poligono.getPerimetro()+" u");
	}

	public static void main(String[] args) {
		new launcher();
	}

}