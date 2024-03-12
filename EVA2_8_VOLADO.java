/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author leaha
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //numero aleatorio en Java: VALORES / 0 y 1.
        //Ejem... 0.323435353
        //0.6353635343
        
        double moneda;
        moneda = Math.random(); //Math libreria
        
        System.out.println("El valor de moneda = "+ moneda);
        
        //0.5 es la mitad del rango
        
        if (moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
        
        
        
    }
    
}
