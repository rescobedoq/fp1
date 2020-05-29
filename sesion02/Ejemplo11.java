package fp_02;

import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hallar el area de un triangulo
		//Se necesitan ingresar dos valores base y la altura
		//A=(b.h)/2
		
		Scanner juancito = new Scanner(System.in);
		
		System.out.println("Ingrese base: ");		
		String base = juancito.nextLine(); //Ejemplo "12"->int(12), "5.5"->int(5.5)
		
		System.out.println("Ingrese altura: ");		
		String altura = juancito.nextLine();
		
		double A = (Double.parseDouble(base)*Double.parseDouble(altura))/2;
		
		System.out.println("Area: "+A);	

	}

}
