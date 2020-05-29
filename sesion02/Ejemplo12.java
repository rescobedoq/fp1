package fp_02;

import java.util.Scanner;

public class Ejemplo12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hallar el area de un triangulo
		//Se necesitan ingresar dos valores base y la altura
		//A=(b.h)/2
		
		Double base, altura;
		
		Scanner juancito = new Scanner(System.in);
		
		System.out.println("Ingrese base: ");		
		base = juancito.nextDouble(); //Ejemplo "12"->int(12), "5.5"->int(5.5)
		
		System.out.println("Ingrese altura: ");		
		altura = juancito.nextDouble();
		
		double A = (base*altura)/2;
		
		System.out.println("Area: "+A);	

	}

}
