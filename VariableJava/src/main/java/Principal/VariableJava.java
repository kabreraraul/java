package Principal;

/**
 *
 * @author kbrer
 */
import java.util.Scanner;

public class VariableJava {
    
    public static void main(String args[]){
    String nombre;
    
    Scanner entrada= new Scanner(System.in);
    
    System.out.print("Ingresa tu nombre: ");
    nombre= entrada.nextLine();
    
     System.out.print("Hola ");
     System.out.print(nombre);
     System.out.print(" ¿Cómo estas?");
    }
    
}
