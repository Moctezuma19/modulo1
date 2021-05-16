/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestFactura {

	/**
	* Metodo que prueba que el precio por unidad se trata de cambiar a un valor negativo
	* se establece a 0
	* @param cambioUnidad Valor negativo al cual se quiere cambiar el precio por unidad
	* @throws Exception Lanza una excepcion si la cantidad pasada como parametro no es negativa
	* @return Devuelve 1 si la prueba paso, de lo contrario 0.
	*/
	public static int TrivialCambioNegativoPrecioUnidad(double cambioUnidad) throws Exception{
		if(cambioUnidad >= 0){
			throw new Exception("TrivialCambioNegativoPrecioUnidad: se espera un cambio negativo");
		}
		int cantidad = ThreadLocalRandom.current().nextInt(0, 100);
		Random r = new Random();
		double pu = 1.0 + (10000.0 - 1.0) * r.nextDouble();
		Factura f = new Factura();
		f.cambiaPrecioUnidad(pu);
		f.cambiaCantidadComprada(cantidad);
		System.out.println("TrivialCambioNegativoPrecioUnidad:\n >> factura con P/U : $" + f.obtenPrecioUnidad() 
			+ " y cantidad " + f.obtenCantidadComprada());
		System.out.println(" >> Se cambiara P/U a : $" + cambioUnidad );
		System.out.println(" >> Se espera factura con P/U: $0.00");
		double anterior = f.obtenPrecioUnidad();
		f.cambiaPrecioUnidad(cambioUnidad);
		System.out.println(" >> Se cambio factura con P/U: $" + f.obtenPrecioUnidad());
		if(f.obtenPrecioUnidad() != 0.0){
			System.out.println(" >> Prueba fallada");
			return 0;
		}
		System.out.println(" >> Prueba fallada");
		return 1;

	}

	/**
	* Metodo que prueba que la cantidad comprada cuando se trata de cambiar a un valor negativo
	* se establece a 0
	* @param cambioCantidad Valor negativo al cual se quiere cambiar la cantidadCOmprada
	* @throws Exception Lanza una excepcion si la cantidad pasada como parametro no es negativa
	* @return Devuelve 1 si la prueba paso, de lo contrario 0.
	*/
	public static int TrivialCambioNegativoCantidadComprada(int cambioCantidad) throws Exception{
		if(cambioCantidad >= 0){
			throw new Exception("TrivialCambioNegativoCantidadComprada: se espera un cambio negativo");
		}
		int cantidad = ThreadLocalRandom.current().nextInt(0, 100);
			//int cantidad2 = ThreadLocalRandom.current().nextInt(0, 100);
		Random r = new Random();
		double pu = 1.0 + (10000.0 - 1.0) * r.nextDouble();
		Factura f = new Factura();
		f.cambiaPrecioUnidad(pu);
		f.cambiaCantidadComprada(cantidad);
		System.out.println("TrivialCambioNegativoCantidadComprada:\n >> factura con P/U : $" + f.obtenPrecioUnidad() 
			+ " y cantidad " + f.obtenCantidadComprada());
		System.out.println(" >> Se cambiara P/U a : $" + cambioCantidad );
		System.out.println(" >> Se espera factura con P/U: $0.00");
		double anterior = f.obtenCantidadComprada();
		f.cambiaCantidadComprada(cambioCantidad);
		System.out.println(" >> Se cambio factura con P/U: $" + f.obtenCantidadComprada());
		if(f.obtenCantidadComprada() != 0.0){
			System.out.println(" >> Prueba fallada");
			return 0;
		}
		System.out.println(" >> Prueba fallada");
		return 1;

	}

	/**
	 * Prueba que el total de la factura sea positivo cuando el valor por unidad y
	 * la cantidad comprada son positivas
	 * 
	 * @param precioUnidad precio por unidad que debe ser positivo
	 * @param cantidad     cantidad de unidades compradas que debe ser positivo
	 * @throws Exception Lanza la excepcion si los parametros no son positivos
	 * @return Devuelve 1 si la prueba paso, de lo contrario 0
	 */
	public static int TotalFacturaPositivo(double precioUnidad, int cantidad) throws Exception {
		if (precioUnidad < 0 || cantidad < 0) {
			throw new Exception("TotalFacturaPositivo: se espera como entrada cantidades positivas");
		}
		Factura f = new Factura();
		double totalEsperado = precioUnidad * (double) cantidad;
		System.out.println("TotalFacturaNegativo:\n >> factura con P/U : $" + precioUnidad + " y cantidad " + cantidad);
		System.out.println(" >> Total de factura esperado : $" + totalEsperado);
		f.cambiaPrecioUnidad(precioUnidad);
		f.cambiaCantidadComprada(cantidad);
		double resultado = f.getTotalFactura();
		System.out.println(" >> Total de factura que se obtuvo : $" + resultado);
		if ( resultado != totalEsperado) {
			System.out.println(" >> Prueba fallada");
			return 0;
		}
		System.out.println(" >> Prueba pasada");
		return 1;
	}

	/**
	 * Prueba que el total de la factura sea cero cuando el valor por unidad o la
	 * cantidad comprada son negativas
	 * 
	 * @param precioUnidad precio por unidad
	 * @param cantidad     cantidad de unidades
	 * @throws Exception Lanza la excepcion si ambos parametros son positivos
	 * @return Devuelve 1 si la prueba paso, de lo contrario 0
	 */
	public static int TotalFacturaNegativa(double precioUnidad, int cantidad) throws Exception {
		if (precioUnidad >= 0 && cantidad >= 0) {
			throw new Exception("TotalFacturaNegativo:\n >> Se esperaba como entrada al menos una cantidad negativa.");
		}
		Factura f = new Factura();
		// double totalEsperado = precioUnidad * (float) cantidad;
		f.cambiaPrecioUnidad(precioUnidad);
		f.cambiaCantidadComprada(cantidad);
		System.out.println("TotalFacturaNegativo:\n >> factura con P/U : $" + precioUnidad + " y cantidad " + cantidad);
		System.out.println(" >> Total de factura esperado : $0.00");
		double resultado = f.getTotalFactura();
		System.out.println(" >> Total de factura que se obtuvo : $" + resultado);
		if (resultado != 0) {
			System.out.println(" >> Prueba fallada");
			return 0;
		}
		System.out.println(" >> Prueba pasada");
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Programa para probar la clase Factura");
		System.out.println(" Pruebas a correr y numero de cantidad a correr");
		System.out.println(
				"  TrivialCambioNegativoPrecioUnidad (1) Prueba que el precio por unidad cuando es cambiado a un valor negativo se establece a 0");
		System.out.println(
				"  TrivialCambioNegativoCantidadComprada (1) Prueba que la cantidad comprada cuando es cambiada a un valor negativo se establece a 0");
		System.out.println(
				"  TotalFacturaPositivo (1) Prueba que el total de la factura sea positivo cuando el valor por unidad y la cantidad comprada son positivas");
		System.out.println(
				"  TotalFacturaNegativo (3) Prueba que el total de la factura sea cero cuando el valor por unidad o la cantidad comprada son negativas");
		int cuenta = 0;
		try {
			int cantidad = ThreadLocalRandom.current().nextInt(0, 100);
			//int cantidad2 = ThreadLocalRandom.current().nextInt(0, 100);
			Random r = new Random();
			double pu = 1.0 + (10000.0 - 1.0) * r.nextDouble();

			cuenta += TrivialCambioNegativoPrecioUnidad(-pu);
			cuenta += TrivialCambioNegativoCantidadComprada(-cantidad);
			cuenta += TotalFacturaPositivo(pu, cantidad);
			cuenta += TotalFacturaNegativa(pu,-cantidad);
			cuenta += TotalFacturaNegativa(-pu,cantidad);
			cuenta += TotalFacturaNegativa(-pu,-cantidad);

			System.out.println("Pasaron " + cuenta + " de 6 pruebas");

		} catch (Exception e) {
			System.out.println("ERROR:: Hubo un error en la configuracion de una prueba");
			System.out.println(e);
		}
	}
}