/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

import java.util.Random;

public class Empleado{

	private static int EMPLEADOS = 0;

	private String nombre;
	private String apellido;
	private double salarioMensual;

	public Empleado(String nombre, String apellido, double salarioMensual){
		EMPLEADOS++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
	}
	public void cambiaNombre(String nombre){
		this.nombre = nombre;
	}

	public String obtenNombre(){
		return this.nombre;
	}

	public void cambiaApellido(String apellido){
		this.apellido = apellido;
	}

	public String obtenApellido(){
		return this.apellido;
	}

	public void cambiaSalarioMensual(double salarioMensual){
		this.salarioMensual = salarioMensual;
	}

	public double obtenSalarioMensual(){
		return this.salarioMensual;
	}
	//metodo para ver la cantidad de empleados
	public static int obtenEmpleados(){
		return EMPLEADOS;
	}

	public static void cambiaEmpleados(int empleados){
		EMPLEADOS = empleados;
	}

	@Override
	public String toString(){
		return nombre + " " + apellido + " : $" + salarioMensual + " mensual";
	}
	public static void main(String[] args) {
		Random r = new Random();
		double randomValue = 1.0 + (10000.0 - 1.0) * r.nextDouble();
		Empleado e1 = new Empleado("John","Sheppard",randomValue);
		System.out.println(e1);

		randomValue = 1.0 + (10000.0 - 1.0) * r.nextDouble();
		Empleado e2 = new Empleado("Garrus","Vakarian",randomValue);
		System.out.println(e2);

		System.out.println("Cantidad de empleados: " + Empleado.obtenEmpleados());

		e1.cambiaSalarioMensual(e1.obtenSalarioMensual() * 1.1);
		e2.cambiaSalarioMensual(e2.obtenSalarioMensual() * 1.1);

		double anual1 = e1.obtenSalarioMensual() * 12.0;
		double anual2 = e2.obtenSalarioMensual() * 12.0;
		
		System.out.println(e1.obtenNombre() + " " + e1.obtenApellido()  + " : $" + anual1 + " anual");
		System.out.println(e2.obtenNombre() + " " + e2.obtenApellido()  + " : $" + anual2 + " anual");

	}
}
