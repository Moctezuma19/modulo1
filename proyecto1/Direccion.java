/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

public class Direccion {
	
	private String calle;
	private String colonia;
	private String ciudad;
	private String estado;
	private String cp;
	private String infoAdicional;
	
	/**
	* Constructor de la clase Direccion
	* @throws Exception Lanza una excepcion si algun parametro es nulo
	*/	
	public Direccion(String calle, String colonia, 
	String ciudad, String estado, String cp, String infoAdicional) throws Exception{
		if (calle == null || colonia == null || ciudad == null || estado == null || cp == null
			|| infoAdicional == null){
			throw new Exception("Todos los campos de direccion deben ser llenados");
		}
		this.calle = ciudad;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.estado = estado;
		this.cp = cp;
		this.infoAdicional = infoAdicional;
	}
	public String obtenCalle() {
		return calle;
	}

	public void cambiaCalle(String calle) {
		this.calle = calle;
	}
	
	public String obtenColonia() {
		return colonia;
	}

	public void cambiaColonia(String colonia) {
		this.colonia = colonia;
	}

	public String obtenCiudad() {
		return ciudad;
	}

	public void cambiaCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String obtenEstado() {
		return estado;
	}

	public void cambiaEstado(String estado) {
		this.estado = estado;
	}

	public String obtenCp() {
		return cp;
	}

	public void cambiaCp(String cp) {
		this.cp = cp;
	}

	public String obtenInfoAdicional() {
		return infoAdicional;
	}

	public void cambiaInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

}