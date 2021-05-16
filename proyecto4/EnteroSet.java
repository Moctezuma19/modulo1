/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

public class EnteroSet{
	
	private boolean[] arreglo;

	public EnteroSet(){
		arreglo = new boolean[101];
	}

	public void cambiaArreglo(boolean [] arreglo){
		this.arreglo = arreglo;
	}

	public boolean[] obtenArreglo(){
		return this.arreglo;
	}
	//Hace la operacion union de dos EnteroSet
	public EnteroSet union(EnteroSet e){
		if(e == null){
			return null;
		}
		EnteroSet u = new EnteroSet();
		for(int i = 0; i < arreglo.length; i++){
			u.arreglo[i] = this.arreglo[i] || e.arreglo[i];
		}

		return u;
	}
	//Hace la operacion de interseccion de dos EnteroSet
	public EnteroSet interseccion(EnteroSet e){
		if(e == null){
			return null;
		}
		EnteroSet u = new EnteroSet();
		for(int i = 0; i < arreglo.length; i++){
			u.arreglo[i] = this.arreglo[i] && e.arreglo[i];
		}

		return u;
	}
	//Hace la insercion de un elemento en el EnteroSet
	public void insertaElemento(int posicion){
		if(posicion < 0 && posicion >= this.arreglo.length){
			return;
		}
		this.arreglo[posicion] = true;
	}
	//Elimina un elemento del EnteroSet
	public void eliminaElemento(int posicion){
		if(posicion < 0 && posicion >= this.arreglo.length){
			return;
		}
		this.arreglo[posicion] = false;
	}
	// Devuelve una cadena con la representacion numerica del EnteroSet
	public String toSetString(){
		String cadena = "[";
		for(int i = 0; i < this.arreglo.length; i++){
			if(this.arreglo[i]){
				cadena += " " + i + " ";
			}
		}
		cadena += "]";
		return cadena;
	}
	// Verifica que dos EnteroSet sean identicos
	public boolean esIgualTo(EnteroSet e){
		for(int i = 0; i < this.arreglo.length; i++){
			if(this.arreglo[i] != e.arreglo[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		EnteroSet c = new EnteroSet();
		EnteroSet e = new EnteroSet();
		System.out.println("Se usaran conjuntos unicamente inicializados");
		System.out.println("Conjunto 1: " + c.toSetString());
		System.out.println("Conjunto 2: " + e.toSetString());
		System.out.println("omprobando union - Se espera [] y el resultado es: ");
		System.out.println(c.union(e).toSetString());
		System.out.println("Comprobando interseccion - Se espera [] y el resultado es: ");
		System.out.println(c.interseccion(e).toSetString());
		System.out.println("Comprobando esIgualTo - Se espera true y el resultado es: ");
		System.out.println(c.esIgualTo(e));
		c.insertaElemento(0);
		c.insertaElemento(2);
		System.out.println("Comprobando insertaElemento con valores 0 y 2 - Se espera [0 2] y el resultado es: ");
		System.out.println(c.toSetString());
		c.eliminaElemento(0);
		System.out.println("Comprobando eliminaElemento con valorSe espera [ 2 ] y el resultado es: ");
		System.out.println(c.toSetString());
		System.out.println("Comprobando union - Se espera [ 2 ] y el resultado es: ");
		System.out.println(c.union(e).toSetString());
		System.out.println("Comprobando interseccion - Se espera [] y el resultado es: ");
		System.out.println(c.interseccion(e).toSetString());

	}
}