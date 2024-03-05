/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author leaha
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMETICOS
        //SUMA+ , RESTA -, MULTIPLICACION *, DIVISION /
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1+num2; //operador de suma +
        //Si en el operador + uno de los términos es una cadena, todo se
        //convierte a cadena y se unen
        //CONCATENACIÓN: Unión de cadenas de texto
        
        // Gracias a esto se lee como texto **
        
        //**SUMA**
        System.out.println("La suma es ");
        System.out.println(suma);
        
        boolean prueba = true;
        System.out.println("El valor de prueba es " + prueba); //**EJEMPLO
        
        //**MULTIPLICACIÓN**
        int multi;
        multi = num1*num2;
        
        System.out.println("La multiplicación es " + multi);
        
        //**DIVISIÓN**
        int divi = 7/2; //SI los numeros son enteros aparece en ENTERO
        
        System.out.println("La división de 5/3 es " + divi);
        
        double diviDouble = 7/2;
        
        System.out.println("La división (double) de 7/2 es " + diviDouble);
        
        //**ACUMULADORES**
        //SUMA +=, RESTA -=, MULTI *=, DIVI /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;*/
        
        sumatoria += 90;
        sumatoria += 80;  //SE AGREGA CADA UNO A LA SUMATORIA
        sumatoria += 80;
        
        System.out.println("La sumatoria es " + sumatoria);
        
        sumatoria -= 70;  //EQUIVALENTE = sumatoria - 70;
        
        System.out.println("La sumatoria es " + sumatoria);
        
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum = " + multiAcum);
        multiAcum *= 5;
        System.out.println("Mutliacum = " + multiAcum);
    }
    
}
