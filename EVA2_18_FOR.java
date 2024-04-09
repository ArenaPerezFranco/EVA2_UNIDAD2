
package eva2_18_for;

/**
 *
 * @author leaha
 */
public class EVA2_18_FOR {

    
    public static void main(String[] args) {
        
        //  INICIO;  CONDICIÓN;  INCREMENTO/DECREMENTO
        for(int i = 1; i <= 10; i += 1){ //LLAVES OPCIONALES, SOLO CUANDO HAY MAS DE UNA INSTRUCCION
            System.out.print(i + " - ");
        }
        System.out.println("");
            for(int i = 10; i >= 1; i --){ //Se puede usar += / ++1 o --/ -=1
            System.out.print(i + " - ");
        }
        
            //IMPRIMIR LOS NUMEROS PARES ENTRE 0 Y 10
            //2,4,6,8,9,10
            System.out.println("");
            for( int i = 0; i <= 100; i +=2){ //Si se quiere usar algo diferente a 1 usa +=/-=
                System.out.print(i + " - ");
        }
    }
    }
    

