/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

public class Factura{
	
	private String numero;
	private String descripcion;
	private int cantidadComprada;
	private double precioUnidad;

	public String obtenNumero(){
		return this.numero;
	}

	public void cambiaNumero(String numero){
		this.numero = numero;
	}

	public String obtenDescripcion(){
		return this.descripcion;
	}

	public void cambiaDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public int obtenCantidadComprada(){
		return this.cantidadComprada;
	}

	public void cambiaCantidadComprada(int cantidadComprada){
		this.cantidadComprada = (cantidadComprada < 0)?0:cantidadComprada;
	}

	public double obtenPrecioUnidad(){
		return this.precioUnidad;
	}

	public void cambiaPrecioUnidad(double precioUnidad){
		this.precioUnidad = (precioUnidad < 0.0)?0.0:precioUnidad;
	}

	public double getTotalFactura(){
		return (double)this.cantidadComprada * precioUnidad;
	}
}