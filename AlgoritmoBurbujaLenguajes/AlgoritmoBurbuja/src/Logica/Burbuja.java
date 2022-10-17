
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class Burbuja {
    private int array[];
    private long startTime;
    private long endTime;
    public Burbuja() {
    }
    private void llenarArreglo(int N){
        array=new int[N];
        int temp=array.length;
        for(int i=0;i<array.length;i++){
            array[i]=temp;
            temp-=1;
        }
    }
    private void imprimirArreglo(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    private void intercambio(int min,int i){
        int aux;
        aux=array[i];
        array[i]=array[min];
        array[min]=aux;
    }
    private void ordenarArreglo() {
        int i,j;
        for (i = array.length; i >=0; i--) {
            for (j = 1; j < i; j++) {
                if(array[j-1] > array[j]){
                    intercambio(j-1, j);
                }
            }
        }
    }
    public void iniciar() {
        for(int N=100;N<=10000;N+=100){
            llenarArreglo(N);
            startTime=System.nanoTime();
            ordenarArreglo();
            endTime=System.nanoTime();
            System.out.println("N: "+N+" Duración: " + (endTime-startTime)/1e6 + " ms");
        }
    }


    
}
