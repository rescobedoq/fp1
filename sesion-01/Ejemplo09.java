import java.util.Scanner;

public class Ejemplo09{

  public static void main(String[] args) throws IOException{
    
    System.out.println("Input con Scanner");

    //Inicializar ingreso por teclado
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese primer numero : ");
    int n1 = teclado.nextLine();  

    System.out.println("Ingrese primer numero : ");
    int n2 = teclado.nextLine(); 

    int suma = n1 + n2;

    System.out.println("Vamos a sumar estos dos números");
    System.out.println("El resultado es: " + (suma));

  }

}