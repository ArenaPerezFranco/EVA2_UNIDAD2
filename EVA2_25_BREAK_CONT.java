
package eva2_25_break_cont;

/**
 *
 * @author leaha
 */
public class EVA2_25_BREAK_CONT {

    
    public static void main(String[] args) {
        //break --> ROMPER --> Termina el ciclo completamente
        //Continue --> TERMINA LA ITERACIÓN(repetición)ACTUAL
        
        //-->Se pueden aplicar en for, while, Do while..<---
        
    for (int i = 0; i < 100; i++) {
         int mod = i % 2;
         if (mod != 0)//i / 2 es divisible       ! = No cumple
            continue; // Al no cumplir, el continuo imprime el numero.
            
         System.out.println(i);
            
        }
        System.out.println("BREAK : >>>>>>>>>>>>>>>>>>>");
        
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
           if (i == 50)
               break; //Al llegar a lo señalado se rompe, PARA EL CICLO.
            
        }
    }
    
}
