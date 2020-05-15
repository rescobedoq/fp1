import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input02
{
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader miTeclado = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Por favor ingrese un numero ");

        String n1 = miTeclado.readLine(); 

        System.out.println("Por favor ingrese un segundo numero ");

        String n2 = br.readLine();

        int suma = Integer.parseInt(n1) + Integer.parseInt(n2);

        System.out.println("Suma " + suma );
        
    }
}