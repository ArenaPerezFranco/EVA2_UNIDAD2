/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana en número (1-7): ");
        dia = captura.nextInt();
        
        if(dia == 1) // Si hay mas de 1 instrucción, poner llaves {}
            System.out.println("Domingo");
        else if(dia == 2)
        System.out.println("Lunes");
        else if(dia == 3)
        System.out.println("Martes");
        else if(dia == 4)
        System.out.println("Miercoles");
        else if(dia == 5)
        System.out.println("Jueves");
        else if(dia == 6)
        System.out.println("Viernes");
        else if(dia == 7)
        System.out.println("Sabado");
        
        else 
            System.out.println("El numero no es un día válido");
    }
    
}
