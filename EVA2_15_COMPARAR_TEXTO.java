/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMPARAR TEXTO EN JAVA
        
        String dia;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el dia (Lunes, Martes etc..");
        dia = captu.nextLine();
        
        if(dia.equals("domingo")) //Asi se compara al ser texto, NO comparar ==
            System.out.println("1");
        else if (dia.equals("lunes"))
            System.out.println("2");
        else if (dia.equals("martes"))
            System.out.println("3");
        else if (dia.equals("miercoles"))
            System.out.println("4");
        else if (dia.equals("jueves"))
            System.out.println("5");
        else if (dia.equals("viernes"))
            System.out.println("6");
        else if (dia.equals("sabado"))
            System.out.println("7");
        
        else 
            System.out.println("Otro día");

   
    }
    
}
