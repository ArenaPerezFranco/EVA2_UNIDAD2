/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA1_7_PAR_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, divi,resi;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un número entero: ");
        num = captu.nextInt();
        
        divi = num/2;
        System.out.println("Division entera de " + num + " /2 = " + divi);
        
        resi = num % 2;
        System.out.println("El residuo de " + num + "%2 = " + resi);
        
        //DETERMINAR NUMERO PAR O IMPAR
        
        if (resi==1)
            System.out.println(num + " Es impar"); //VERDADERO
        else 
            System.out.println(num + " Es par"); //FALSO
        
        
    }
    
}
