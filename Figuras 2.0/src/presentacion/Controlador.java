
package presentacion;

import figuras.Vertice;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener{
    private Modelo modelo;
    public Controlador(Vista aThis) {
        this.modelo = aThis.getModelo();
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if(evento.getActionCommand().equals("Dibujar Figura")){
                if(modelo.getVentana().getRadCirculo().isSelected()){
                    JOptionPane.showMessageDialog(modelo.getVentana(), "Inserte los valores para el circulo ", "CIRCULO", JOptionPane.WARNING_MESSAGE);
                    int posX=Integer.parseInt(JOptionPane.showInputDialog(modelo.getVentana(), "Pos X"));
                    int posY=Integer.parseInt(JOptionPane.showInputDialog(modelo.getVentana(), "Pos Y"));
                    double radio=Double.parseDouble(JOptionPane.showInputDialog(modelo.getVentana(),"RADIO"));
                    if(posX<0 || posY<0 ||radio<=0){
                        JOptionPane.showMessageDialog(modelo.getVentana(), "VALORES INVALIDOS, SOLO POSITIVOS","ERROR",JOptionPane.ERROR_MESSAGE);
                    }else{
                        modelo.dibujarCirculo(posX, posY, radio);
                    }
                }else if(modelo.getVentana().getRadPoligono().isSelected()){
                    JOptionPane.showMessageDialog(modelo.getVentana(), "Inserte los valores para el poligono", "POLIGONO", JOptionPane.WARNING_MESSAGE);
                    int posX=Integer.parseInt(JOptionPane.showInputDialog(modelo.getVentana(), "Pos X"));
                    int posY=Integer.parseInt(JOptionPane.showInputDialog(modelo.getVentana(), "Pos Y"));
                    int numV=Integer.parseInt(JOptionPane.showInputDialog(modelo.getVentana(),"Numero vertices"));
                    if(posX<0 || posY<0 ||numV<=0){
                        JOptionPane.showMessageDialog(modelo.getVentana(), "VALORES INVALIDOS, SOLO POSITIVOS","ERROR",JOptionPane.ERROR_MESSAGE);
                    }else{
                        ArrayList<Vertice> vertices = new ArrayList<>();
                        for(int i=0;i<numV;i++){
                            double x=Double.parseDouble(JOptionPane.showInputDialog(modelo.getVentana(),"Vertice componente X "+i));
                            double y=Double.parseDouble(JOptionPane.showInputDialog(modelo.getVentana(),"Vertice componente Y "+i));
                            if(x <= 0|| y <=0){
                                i--;
                                JOptionPane.showMessageDialog(modelo.getVentana(), "Vertices solo en plano positivo","ERROR",JOptionPane.ERROR_MESSAGE);
                            }else{
                                Vertice v = new Vertice(x, y);
                                vertices.add(v);
                            }
                        }
                        if(!vertices.isEmpty()){
                            modelo.dibujarPoligono(posX, posY, vertices);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(modelo.getVentana(), "¡Seleccione una figura!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else if(evento.getActionCommand().equals("LIMPIAR")){
                modelo.limpiarCanvas();
            }
        } catch (HeadlessException  | NumberFormatException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            if(e.getMessage().equals("For input string: \"\"")){
                JOptionPane.showMessageDialog(modelo.getVentana(), "POR FAVOR INGRESE UN VALOR","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }
    };
    
}
