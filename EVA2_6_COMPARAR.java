/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CUAL ES ELMAYOR VALOR ENTRE LOS DOS NÚMEROS
        //PEDIR AL USUARIO DOS VALORES ENTEROS
        
        int num1, num2;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Introduce el primer numero");
        num1 = captu.nextInt();
        
        System.out.println("Introduce el segundo numero");
        num2 = captu.nextInt();
        
        //CUAL ES EL MAYOR
        
        if (num1 > num2)
            System.out.println(num1 + " Es mayor!!");
        
        else{
            
            if (num1 == num2)//Se compara: num1 es igual que num2
                System.out.println("Son iguales");
        else
            System.out.println(num2 + " Es mayor!!");
        }
    }
    
}
