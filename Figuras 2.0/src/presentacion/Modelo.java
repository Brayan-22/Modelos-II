
package presentacion;

import figuras.Circulo;
import figuras.Figura;
import figuras.Poligono;
import figuras.Vertice;
import figurasGraficas.CirculoGrafico;
import figurasGraficas.FiguraGrafica;
import figurasGraficas.PoligonoGrafico;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;


public class Modelo {
    private FiguraGrafica figuraGrafica;
    private Vista ventana;
    private Figura figura;
    public Modelo(){
    }
    public Vista getVentana(){
        if(this.ventana==null){
            ventana=new Vista(this);
        }
        return ventana;
    }
    public void iniciarApp(){
        getVentana().setSize(500,500);
        getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getVentana().setResizable(false);
        getVentana().setLocationRelativeTo(null);
        getVentana().setTitle("Figuras V2.0");
        getVentana().setVisible(true);
    }

    public void dibujarCirculo(int posX,int posY,double radio) {
        figura = new Circulo(radio);
        figuraGrafica = new CirculoGrafico(posX, posY, (Circulo) figura);
        figuraGrafica.dibujar(getVentana().getLienzo().getGraphics());
    }
    public void dibujarPoligono(int posX,int posY,ArrayList<Vertice> vertices){
        figura = new Poligono(vertices);
        figuraGrafica = new PoligonoGrafico(posX, posY, (Poligono) figura);
        figuraGrafica.dibujar(getVentana().getLienzo().getGraphics());
    }
    public void limpiarCanvas(){
        BufferedImage bufferTemp = new BufferedImage(getVentana().getLienzo().getWidth(),getVentana().getLienzo().getHeight(),BufferedImage.TYPE_INT_ARGB);
        Graphics g2= bufferTemp.getGraphics();
        for(int x=0;x<=getVentana().getLienzo().getWidth();x++){
            for(int y=0;y<=getVentana().getLienzo().getHeight();y++){
                g2.drawLine(x, y, x, y);
                g2.setColor(new Color(255, 255, 255));
            }
        }
        getVentana().getLienzo().getGraphics().drawImage(bufferTemp, 0, 0, getVentana().getLienzo());
    }
}
