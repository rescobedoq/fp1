package fp1_04;

public class Ejemplo15 {

	public static void main(String[] args) {
			    
	    int num = Integer.parseInt(args[0]); // 2<-  //3<-

	    // 2/2 -> RESIDUO=0 VERDADERO
	    // 3/2 -> RESIDUO=1 FALSO
	    if( (num%2)==0 ) {
	    	System.out.println("El número ingresado es par.");
	    }

	}

}

//Rpta: num=2. 1->2->3->4->5->6->7->8->9->11->12->13->14->15->16->17
//Rpta: num=3. 1->2->3->4->5->6->7->8->9->11->13->14->15->16->17

//=	asignacion VARIABLE:VALOR
//== ¿pregunta si es igual?
