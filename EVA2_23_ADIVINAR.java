
package eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_23_ADIVINAR {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; //Numero que tiene que adivinar
        int valor = 0; //Valor para almacenar lo que capture el usuario
        
        Scanner captu = new Scanner(System.in);
        
        do{
            
            System.out.println("¿Cual es el número? (Entre el uno y el diez)");  
            valor = captu.nextInt();
            
        }while(num != valor); // Mientras la condición sea verdad se repite
        System.out.println("ADIVINASTE!!");

    }
    
}
