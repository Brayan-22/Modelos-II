/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGraficas;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author alejandro
 */
public class Vista extends JFrame{
    private Canvas lienzo;
    public Vista(){
        this.setSize(500, 500);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
