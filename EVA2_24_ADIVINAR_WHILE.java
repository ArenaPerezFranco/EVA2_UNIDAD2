
package eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_24_ADIVINAR_WHILE {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; //Numero que tiene que adivinar
        int valor = 0; //Valor para almacenar lo que capture el usuario
        
        Scanner captu = new Scanner(System.in);
        
        while(num != valor){ // Mientras la condición sea verdad se repite
        System.out.println("¿Cual es el numero?(Entre el numero 1 al 10)");
        valor = captu.nextInt();
        
        }
        System.out.println("ADIVINASTE!!");
    }
          
    
}
