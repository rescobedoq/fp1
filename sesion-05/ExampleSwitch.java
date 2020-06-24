package fp05;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ExampleSwitch {

	public static void main(String[] args) {
		
		//int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
		
		LocalDate localDate = LocalDate.now(); 
		int number = DayOfWeek.from(localDate).getValue();
		
		switch( number ) {
			
		case 1:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al LUNES");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al MARTES");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al MIÉRCOLES");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al JUEVES");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al VIERNES");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al SÁBADO");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó corresponde al DOMINGO");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El ńumero que ingresó no corresponde a un día de la semana");
			break;	
		
		}

	}

}

