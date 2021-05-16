/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

public class Marca{
	
	private String modelo;
	private String nombre;
	private int anio;
	private String id;

	public String obtenModelo() {
		return modelo;
	}

	public void cambiaModelo(String modelo) {
		this.modelo = modelo;
	}
	public int obtenAnio() {
		return this.anio;
	}

	public void cambiaAnio(int anio) {
		this.anio = anio;
	}

	public String obtenMarca() {
		return this.nombre;
	}

	public void cambiaMarca(String nombre) {
		this.nombre = nombre;
	}

	public String obtenId(){
		return this.id;
	}

	public void cambiaId(String id){
		this.id = id;
	}

	public void cambiaNombre(String nombre){
		this.nombre = nombre;
	}

	public String obtenNombre(){
		return this.nombre;
	}
}