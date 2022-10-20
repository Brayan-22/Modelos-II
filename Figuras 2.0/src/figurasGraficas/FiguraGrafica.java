
package figurasGraficas;

import java.awt.Graphics;

public abstract class FiguraGrafica extends figuras.Figura{
    protected int posX;
    protected int posY;
    public FiguraGrafica(int posX,int posY){
        this.posX=posX;
        this.posY=posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public abstract void dibujar(Graphics g);
}