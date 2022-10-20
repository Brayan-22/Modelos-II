package launcherPrueba2;

import presentacion.Modelo;

public class launcher {
    private Modelo miApp;
    public launcher(){
        miApp = new Modelo();
        miApp.iniciarApp();
    }
    public static void main(String[] args) {
        new launcher();
    }
    
}
