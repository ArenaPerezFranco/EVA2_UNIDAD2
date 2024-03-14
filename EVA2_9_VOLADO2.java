/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, mone2;
        double mone;
        
         Scanner captu = new Scanner (System.in);
         System.out.println("Introduce 1 si quieres elgir cara o 2 si quieres elegir cruz");
         num = captu.nextInt();

         //NUMERO ALEATORIO
         mone = Math.random(); 
         System.out.println("Valor de la moneda = " + mone);
         
        if (mone > 0.5){
            mone2 = 1;
            System.out.println("CARA");
        }else{
             mone2 = 2;
            System.out.println("CRUZ");
        
        }
        
        if (num == mone2)
        System.out.println("GANASTE!!");
        else
        System.out.println("PERDISTE, VUELVE A INTENTAR");
                     
        
         
         }
    }
    
