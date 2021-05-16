/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

import java.util.Date;

public class Propietario {

	private String nombre;
	private String rfc;
	private String curp;
	private Date fechaNacimiento;
	private Direccion direccion;
	/**
	* @throws Exception Lanza la excepcion si el parametro direccion es nulo o esta mal formado
	*/
	public Propietario(String nombre, String rfc, String curp, Direccion direccion) throws Exception {
		this.nombre = nombre;
		this.curp = curp;
		this.rfc = rfc;
		this.fechaNacimiento = null;
		if(direccion == null){
			throw new Exception("La direccion no puede ser nula");
		}
		try{
			this.direccion = direccion;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
