package fp05;

import javax.swing.JOptionPane;

public class ExampleIfElseIf {

	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Ingrese un número entero");
		
		if( (Integer.parseInt(number)%2) == 0 ) {
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó SI es par");
		}else {
			if( (Integer.parseInt(number)%5) == 0 ) {
				JOptionPane.showMessageDialog(null, "El ńumero que ingresó es múltiplo de 5");
			}else {
				JOptionPane.showMessageDialog(null, "El ńumero que ingresó NO es par");
			}
		}

	}

}