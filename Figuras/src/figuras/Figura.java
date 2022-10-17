package figuras;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	public Figura() {
	}
	public Figura(double area,double perimetro) {
		this.area=area;
                this.perimetro=perimetro;
	}
	public abstract double getArea();
	public abstract double getPerimetro();
}
