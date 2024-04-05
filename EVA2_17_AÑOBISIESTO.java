package eva2_17_añobisiesto;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_17_AÑOBISIESTO {

    public static void main(String[] args) {
        int año;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Introduce el año: ");
        año = captu.nextInt();
        
        if (año %100 !=0)
            if(año %4 ==0)
                System.out.println("Año Bisiesto");
        else
                System.out.println("Año no Bisiesto");
        else if (año % 400 == 0)
            System.out.println("Año Bisiesto");
    else
            System.out.println("Año no bisiesto");
    }
    
}
