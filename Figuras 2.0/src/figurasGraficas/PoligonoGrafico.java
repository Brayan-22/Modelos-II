/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGraficas;

import figuras.Poligono;
import java.awt.Graphics;
import java.awt.Polygon;


public class PoligonoGrafico extends FiguraGrafica {
    private final Poligono p;
    public PoligonoGrafico(int posX, int posY,Poligono p) {
        super(posX, posY);
        this.p=p;
    }

    @Override
    public void dibujar(Graphics g) {
        Polygon pTemp = new Polygon();
        p.getVertices();
        for(int i=0;i<p.getVertices().size();i++){
            pTemp.addPoint((int)p.getVertices().get(i).getX()+posX, (int)p.getVertices().get(i).getY()+posY);
        }
        g.fillPolygon(pTemp);
    }

    @Override
    public double getArea() {
        return this.p.getArea();
    }

    @Override
    public double getPerimetro() {
        return this.p.getPerimetro();
    }
    
}
