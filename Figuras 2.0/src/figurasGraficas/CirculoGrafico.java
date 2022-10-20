
package figurasGraficas;

import figuras.Circulo;
import java.awt.Graphics;


public class CirculoGrafico extends FiguraGrafica {
    private Circulo C;
    public CirculoGrafico(int posX, int posY,Circulo C) {
        super(posX, posY);
        this.C=C;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.fillOval(posX+(int)C.getRadio(), posY+(int)C.getRadio(), (int)C.getRadio()*2, (int)C.getRadio()*2);
    }

    @Override
    public double getArea() {
        return this.C.getArea();
    }

    @Override
    public double getPerimetro() {
        return this.C.getPerimetro();
    }

    public Circulo getC() {
        return C;
    }

    public void setC(Circulo C) {
        this.C = C;
    }
    
}
