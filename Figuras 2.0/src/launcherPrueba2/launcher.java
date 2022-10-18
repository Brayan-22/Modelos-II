/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package launcherPrueba2;

import figurasGraficas.Vista;



/**
 *
 * @author alejandro
 */
public class launcher {
    private Vista miApp;
    public launcher(){
        miApp= new Vista();
        miApp.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new launcher();
    }
    
}
