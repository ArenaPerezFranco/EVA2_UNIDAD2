/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant, calcSaldo;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantas piezas quieres comprar?");
        cant = captu.nextInt();
        
        if(cant>1000)
            calcSaldo = cant * 500;
        else
            calcSaldo = cant * 800;
        
        System.out.println("El saldo es " + calcSaldo);
    }
    
}
