/**
* @author Jorge Erick Rivera Lopez
* @since 2021
*/
package modulo1;

public class Carro {
	private Marca marca;
	private String color;
	private String chasis;
	private Propietario propietario;
	private int velocidadMaxima;
	private int velocidadActual;
	private int numeroPuertas;
	private boolean techoSolar;
	private int numeroMarchas;
	private boolean esAutomatico;
	private float volumenCombustible;
	private int marchaActual;
	/**
	* Constructor que recibe un objeto de la clase propietario, inicializa el resto de los atrbutos
	* @param propietaro Objeto de la clase propietario
	* @throws Exception Arroja un excepcion si el objeto propietario es nulo o el propietario esta mal formado
	*/
	public Carro(Propietario propietario) throws Exception {
		if(propietario == null){
			throw new Exception("El propietario no puede ser nulo");
		}
		try {
			this.propietario = propietario;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}

		this.marca = null;
		this.color = null;
		this.chasis = null;
		this.velocidadActual = 0;
		this.velocidadMaxima = 0;
		this.numeroPuertas = 0;
		this.techoSolar = false;
		this.numeroMarchas = 0;
		this.esAutomatico = false;
		this.volumenCombustible = 0f;
		this.marchaActual = 1; // 0 reversa
	}


	public String obtenColor() {
		return color;
	}

	public void cambiaColor(String color) {
		this.color = color;
	}


	public String obtenChasis() {
		return chasis;
	}

	public void cambiaChasis(String chasis) {
		this.chasis = chasis;
	}

	public Propietario obtenPropietario() {
		return propietario;
	}

	public void cambiaPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public int obtenVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void cambiaVelocidadMaxima(int velocidadMaxima) {
		if(velocidadMaxima <= 0){
			return;
		}
		this.velocidadMaxima = velocidadMaxima;
	}

	public int obtenVelocidadActual() {
		return velocidadActual;
	}

	public void cambiaVelocidadActual(int velocidadActual) {
		if (velocidadActual > this.velocidadMaxima ) {
			this.velocidadActual = this.velocidadMaxima;
			return;
		} else if (velocidadActual < 0) {
			this.velocidadActual = 0;
			return;
		}
		this.velocidadActual = velocidadActual;
	}

	public int obtenNumeroPuertas() {
		return numeroPuertas;
	}

	public void cambiaNumeroPuertas(int numeroPuertas) {
		if(numeroPuertas > 0) {
			this.numeroPuertas = numeroPuertas;
		}
		
	}

	public boolean obtenTechoSolar() {
		return techoSolar;
	}

	public void cambiaTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public int obtenNumeroMarchas() {
		return numeroMarchas;
	}

	public void cambiaNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public boolean isEsAutomatico() {
		return esAutomatico;
	}

	public void cambiaEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	public float obtenVolumenCombustible() {
		return volumenCombustible;
	}

	public void cambiaVolumenCombustible(float volumenCombustible) {
		if(volumenCombustible >= 0f) {
			this.volumenCombustible = volumenCombustible;
		}
	}

	public Marca obtenMarca(){
		return this.marca;
	}

	public void cambiaMarca(Marca marca){
		this.marca = marca;
	}

	// Los metodos set estan mas abajo
	public int obtenMarchaActual(){	
		return this.marchaActual;
	}
	
	/**
	* Metodo que aumenta en 1 la velocidad actual
	*/
	public void acelera() {
		this.cambiaVelocidadActual(this.velocidadActual + 1);
	}
	/**
	* Metodo que cambia la velocidad actual a 0
	*/
	public void frena() {
		this.cambiaVelocidadActual(0);
	}
	
	//cambia a la marcha siguiente
	public void cambiaMarcha() {
		if(this.marchaActual <= this.numeroMarchas){
			this.marchaActual += 1;
		}
	}
	//Reduce la marcha en uno
	public void reduceMarcha(){

		if(this.marchaActual == 1 && this.velocidadActual > 0){
			return;
		}
		if(this.marchaActual == 0){
			return;
		}
		this.marchaActual -=1;
	}

	public void muestraVolumenCombustible(){
		System.out.println("Volumen de combustible: " + this.volumenCombustible + " Litros");
	}

	//calcula los kilometros que puede recorrer el vehiculo dado los kms por Litro
	public float calculaDistanciaPorRecorrerA(float kmsPorLitro){
		return this.volumenCombustible * kmsPorLitro;

	}
	// calcula los kilometros que puede recorrer el vehiculo dado los litros por km
	public float calculaDistanciaPorRecorrerB(float litrosPorKm){
		return this.volumenCombustible / litrosPorKm;
	}

	public static void main(String[] args) {
		try{
			Direccion d = new Direccion("Av. Agustin de Iturbide","Col. San Juan","CDMX","DF","04888","lote 3");
			Propietario p = new Propietario("Juan Perez","PEJ58124HMCVPR07","PEJ58124SKU",d);
			Marca m = new Marca();
			m.cambiaModelo("sedan");
			m.cambiaNombre("tiida");
			m.cambiaAnio(2009);
			m.cambiaId("123999948484");
			Carro c = new Carro(p);
			c.cambiaMarca(m);
			c.cambiaColor("gris");
			c.cambiaChasis("normal");
			c.cambiaVelocidadMaxima(210);
			c.cambiaNumeroPuertas(5);
			c.cambiaNumeroMarchas(6);
			c.cambiaVolumenCombustible(48f);
		} catch(Exception e){
			System.out.println(e);
		}

	}
}
