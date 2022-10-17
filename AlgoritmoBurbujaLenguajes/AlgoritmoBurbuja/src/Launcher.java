
import Logica.Burbuja;
/**
 *
 * @author alejandro
 */
public class Launcher {
    private Burbuja bubble;
    /**
     * @param args the command line arguments
     */
    
    public Launcher() {
        bubble=new Burbuja();
        bubble.iniciar();
    }

    public static void main(String[] args) {
        new Launcher();
    }
    
}
