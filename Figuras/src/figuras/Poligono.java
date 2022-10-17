package figuras;

import java.util.ArrayList;

public class Poligono extends Figura {
	private ArrayList<Vertice> vertices;
	
	public Poligono(ArrayList<Vertice> vertices) {
                super();
		this.vertices=vertices;
	}
	@Override
	public double getArea() {
		if(vertices.size()>=3) {
			double temp=0.0;
			for(int i=0;i<vertices.size();i++) {
				temp+=(i==(vertices.size()-1))?(vertices.get(i).getX())*(vertices.get(0).getY()):
					(vertices.get(i).getX())*(vertices.get(i+1).getY());
			}
			for(int i=0;i<vertices.size();i++) {
				temp-=(i==(vertices.size()-1))?(vertices.get(i).getY())*(vertices.get(0).getX()):
					(vertices.get(i).getY())*(vertices.get(i+1).getX());
			}
			temp=(0.5)*Math.abs(temp);
			this.area=temp;
		}else {
			return 0.0;
		}
		return this.area;
	}

	@Override
	public double getPerimetro() {	
		if(vertices.size()>=2) {
			double temp=0.0;
			for(int i=0;i<vertices.size();i++) {
				temp+=(i==vertices.size()-1)?
						(Math.sqrt(((Math.pow(((vertices.get(0).getX())-(vertices.get(i).getX())), 2))+(Math.pow(((vertices.get(0).getY())-(vertices.get(i).getY())), 2)))))
						:(Math.sqrt(((Math.pow(((vertices.get(i+1).getX())-(vertices.get(i).getX())), 2))+(Math.pow(((vertices.get(i+1).getY())-(vertices.get(i).getY())), 2)))));
			}
			temp=Math.abs(temp);
			this.perimetro=temp;
		}else {
			return 0.0;
		}
		return this.perimetro;
	}
	
	public ArrayList<Vertice> getVertices() {
		return vertices;
	}
	public void setVertices(ArrayList<Vertice> vertices) {
		this.vertices = vertices;
	}
	

}