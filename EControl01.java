import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EControl01
{
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Por favor ingrese un numero ");

        String n1 = br.readLine(); 

        System.out.println("Por favor ingrese un segundo numero ");

        String n2 = br.readLine();

        if( Integer.parseInt(n1) > Integer.parseInt(n2) ) // VERDADERO o FALSO
        {
            System.out.println("El primer valor es el mayor");
        }

        if( Integer.parseInt(n2) > Integer.parseInt(n1) )
        {
            System.out.println("El segundo valor es el mayor");
        }

        if( Integer.parseInt(n1) == Integer.parseInt(n2) ) //Pregunta si son iguales
        {
            System.out.println("Los dos valores son iguales");
        }
        

        
    }
}