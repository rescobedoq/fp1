package fp05;

import javax.swing.JOptionPane;

public class ExampleIf {

	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Ingrese un número entero");
		
		if( (Integer.parseInt(number)%2) == 0 ) {
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó SI es par");
		}

	}

}
