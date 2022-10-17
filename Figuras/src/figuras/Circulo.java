package figuras;

public class Circulo extends Figura {
	private double radio;
	public Circulo(double radio) {
		super();
		this.radio=radio;
	}
	public Circulo(double area,double perimetro,double radio) {
		super(area,perimetro);
		this.radio=radio;
	}
	@Override
	public double getArea() {
		this.area=((Math.pow(this.radio,2.0))*(Math.PI));
		return this.area;
	}

	@Override
	public double getPerimetro() {
		this.perimetro=(2.0*Math.PI*this.radio);
		return this.perimetro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
