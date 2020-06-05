package fp1_03;

import java.util.Date;

public class Alumno2 {
	
	String nombre;
	Date fechaDeNacimiento;
	boolean genero;
	
	public Alumno2(String nombreX, boolean generoX) {
		this.nombre = nombreX;
		this.genero = generoX;
	}
	
	
	public void estudiar() {
		System.out.println(this.nombre + " Estoy estudiando");
	}
	
	public void dormir() {
		System.out.println(this.nombre + " Estoy durmiendo");
	}
	
	public void comer() {
		System.out.println(this.nombre + " Estoy comiendo");
	}
	

}
