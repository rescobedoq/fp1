package fp_02;

import javax.swing.JOptionPane;

public class Ejemplo14 {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para hallar el Área de un triangulo.");
		
		String base = JOptionPane.showInputDialog("Ingrese base");
		String altura = JOptionPane.showInputDialog("Ingrese altura");
		
		double A = (Double.parseDouble(base)*Double.parseDouble(altura))/2;
		
		JOptionPane.showMessageDialog(null, "El area es :" + A);
	}

}
