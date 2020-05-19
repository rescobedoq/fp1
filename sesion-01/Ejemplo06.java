import java.io.*;

public class Ejemplo06{

  public static void main(String[] args) throws IOException{
    
    System.out.println("Input con BufferedReader");

    //Inicializar ingreso por teclado
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
    
    System.out.println("¿Cúal es tu nombre? : ");

    String nombre = teclado.readLine(); //Asignar lo que se ingrese por teclado a la variable nombre

    System.out.println("Hola " + nombre);
    System.out.println("Tu nombre tiene una longitud de " + nombre.length());
    System.out.println("Bienvenido al curso de FP1");

  }

}