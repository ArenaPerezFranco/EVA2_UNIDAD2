package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_20_FOR_3 {

   
    public static void main(String[] args) {
        
        // Preguntar un mensaje
        //Preguntat cantas veces lo van a repetir
        int N;
        String mensaje;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cual es el mensaje que quieres transmitir?");
        mensaje = captu.nextLine();
        
        System.out.println("¿Cuantas veces lo quieres repetir");
        N = captu.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(mensaje);
           
        }
        System.out.println("");
        
        //IMPRIMIR LA SUMATORIA DE UN NUMERO:
        //Solicitar numero entero, calcular la sumatoria. Ejemplo:
        //El usuario introduce un 5, calcular:
        //1 + 2 + 3 + 4 + 5
        int NE;
        int suma = 0; 
      
        System.out.println("Introduce un numero entero: ");
        NE = captu.nextInt();
        
        for (int i = 1; i <= NE; i++) {
            suma += i; //Acumulador --> Sumatoria = sumatoria + i;
        }
        System.out.println("La sumatoria del 1 al " +NE + " es: " + suma);
        
        //CAPTURAR UN NUMERO E IMPRIMIR UNA SECUENCIA DE *. EJEMPLO:
        //*
        //**
        //***
        System.out.println("");
        int N3;
        
        System.out.println("Introduce un numero para las filas a imprimir: ");
        N3 = captu.nextInt();
        
        for (int i = 1; i <= N3; i++) { //FILAS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(""); // SALTO DE LINEA
        }
        for (int i = N3; i >= 1; i--) { //FILAS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println("");
        }
    }
}
    
