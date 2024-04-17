
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA2_26_BREAK {

    
    public static void main(String[] args) {
        // Acceso por usuario y contraseña
        String usuario, pwd; //pwd = Password
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        
       //Se debe pregunta un numero deteminado de veces, hasta que el usuario y contraseña sean correctos.
       
        while (true) {
            
            System.out.println("Usuario:");
            usuario = captu.nextLine();
            
            System.out.println("Contraseña: ");
            pwd = captu.nextLine();
            
            if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)) { //DATOS CORRECTOS
                break; //ROMPE EL CICLO, ya no preguntara 
            }
            
        }
        System.out.println("Bienvenido al SISTEMA!!");
    }
    
}
