public class Ejemplo10{

  public static void main(String[] args){
    
    System.out.println("Input con los argumentos");

    
    int n1 = Integer.parseInt(args[0]);
 

    int n2 = Integer.parseInt(args[1]);

    int suma = n1 + n2;

    System.out.println("Se sumaron los dos argumentos");
    System.out.println("El resultado es: " + (suma));

  }

}