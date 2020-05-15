import java.io.*;

public class Input01{

  public static void main(String[] args) throws IOException{
    
    System.out.println("Input 01");

    //Inicializar ingreso INPUT
    BufferedReader chocolo = new BufferedReader(new InputStreamReader(System.in)); //teclado<-var Se puede cambiar

    String nombre; //Nombres de personas

    //edad             String->int
    //Peso persona   String->float

    System.out.println("¿Cúal es tu nombre? : ");

    nombre = chocolo.readLine(); //Asignar lo que se ingrese por teclado a la variable nombre

    System.out.println("Hola " + nombre);
    System.out.println("Tu nombre tiene una longitud de " + nombre.length());
    System.out.println("Bienvenido al curso de FP1");

  }

}