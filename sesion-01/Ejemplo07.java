import java.io.*;

public class Ejemplo07{

  public static void main(String[] args) throws IOException{
    
    System.out.println("Input con BufferedReader");

    //Inicializar ingreso por teclado
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
    
    System.out.println("Ingrese un numero entre [0-99] :");
    int num1 = teclado.readLine(); 

    System.out.println("Ingrese otro numero entre [0-99] :");
    int num2 = teclado.readLine(); 

    System.out.println("Vamos a sumar estos dos números");
    System.out.println("El resultado es: " + (num1+num2));

  }

}