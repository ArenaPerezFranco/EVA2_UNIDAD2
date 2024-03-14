/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, mone2;
        double mone;
        
         Scanner captu = new Scanner (System.in);
         System.out.println("Introduce 1 si quieres elgir cara o 2 si quieres elegir cruz");
         num = captu.nextInt();

         //NUMERO ALEATORIO
         mone = Math.random(); 
         System.out.println("Valor de la moneda = " + mone);
         
         //0.5 es la mitad del rango
         
         if (mone > 0.5 && num == 1)
             System.out.println("Adivinaste, es cara!!");
         else
             if(mone<=0.5 && num== 2)
                 System.out.println("Adivinaste, es cruz!!");
         else
                 System.out.println("Perdiste!!");
    }
    
}
