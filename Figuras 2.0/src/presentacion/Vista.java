
package presentacion;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Vista extends JFrame{
    private Modelo modelo;
    private Controlador control;
    private JButton botonDibujar;
    private JRadioButton radCirculo;
    private JRadioButton radPoligono;
    private Canvas lienzo;
    private ButtonGroup grupoBotones;
    private JButton limpiar;
    
    public Vista(Modelo modelo){
        this.modelo=modelo;
        this.setLayout(null);
        initComponents();
        capturarEventos();
    }
    private void initComponents(){
        //getVentana().setSize(600,600);
        //getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getVentana().setResizable(false);
        //getVentana().setLocationRelativeTo(null);
        //getVentana().setVisible(true);
        botonDibujar = new JButton("Dibujar Figura");
        radCirculo = new JRadioButton("Circulo");
        radPoligono = new JRadioButton("Poligono");
        lienzo = new Canvas();
        grupoBotones = new ButtonGroup();
        limpiar = new JButton("LIMPIAR");
        grupoBotones.add(radCirculo);
        grupoBotones.add(radPoligono);
        lienzo.setBackground(new Color(255,255,255));
        lienzo.setBounds(10, 10, 465, 350);
        radCirculo.setBounds(20, 400, 100, 40);
        radPoligono.setBounds(380, 400, 100, 40);
        botonDibujar.setBounds(140, 370, 190, 50);
        limpiar.setBounds(160, 425, 150, 30);
        this.add(botonDibujar);
        this.add(radCirculo);
        this.add(radPoligono);
        this.add(limpiar);
        this.add(lienzo);
    }
    
    private void capturarEventos(){
        this.botonDibujar.addActionListener(getControl());
        this.limpiar.addActionListener(getControl());
    }

    public JRadioButton getRadCirculo() {
        return radCirculo;
    }

    public void setRadCirculo(JRadioButton radCirculo) {
        this.radCirculo = radCirculo;
    }

    public JRadioButton getRadPoligono() {
        return radPoligono;
    }

    public void setRadPoligono(JRadioButton radPoligono) {
        this.radPoligono = radPoligono;
    }
    
    public Controlador getControl(){
        if(this.control==null){
            control = new Controlador(this);
        }
        return control;
    }
    public Modelo getModelo() {
        return modelo;
    }
    public Canvas getLienzo() {
        return lienzo;
    }

    public void setLienzo(Canvas lienzo) {
        this.lienzo = lienzo;
    }
}
