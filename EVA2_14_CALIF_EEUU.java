/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificación (del 0 al 100) : ");
        cali = captu.nextInt();
        
        if (cali >= 90 && cali <= 100)
            System.out.println("Tu calificación es A");
        else if (cali >= 80 && cali <= 89)
            System.out.println("Tu calificación es B");
        else if (cali >= 70 && cali <= 79)
            System.out.println("Tu calificacion es C");
        else if (cali >= 60 && cali <= 69)
            System.out.println("Tu calificacion es D");
        else if (cali >= 0 && cali <= 59)
            System.out.println("Tu calificacion es F");
        else
            System.out.println("Calificación no valida");
        
    
}
}
