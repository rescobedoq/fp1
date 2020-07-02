package lab10;

import javax.swing.JOptionPane;

/*
 * Ejercicio I.1 (FOR)
 * 
 * Author: Richart Smith Escobedo Quispe
 * Email: rescobedoq@unsa.edu.pe
 * Title: Imprimir los valores desde m hasta n enteros. Confiar que siempre m<=n. 
 * Description: Este programa imprime los valores desde el entero 'm' hasta el entero 'n'.
 *              Se confia de que el usuario respetará la condición de que m<=n.
 * Date: Martes, 30 de Junio del 2020. 17:57.
 * Time-work: 
 * License: GPL - Software libre.
 * Notes: El programa lo desarrolle desde cero. No utilice nada de internet ni libros.
 * 
 * */

public class Ifor {

	public static void main(String[] args) {
		
		// Solicitando ingreso de los dos números enteros 'm' y 'n'
		//int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de m : "));
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n : "));
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		
		//Bucle for desde m hasta n con paso 1
		for(int i=m;i<=n;i=i+1) {
			//Imprimiendo por consola el valor de i en cada iteración
			System.out.println(i);
		}
		
		//Descricpión y autor
		System.out.println("Ejercicio Lab 10 - 1:for.");
		System.out.println("Hecho por Richart Smith Escobedo Quispe.");

	}

}
