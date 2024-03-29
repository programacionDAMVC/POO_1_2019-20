package ejercicios.ejercio6;

public class Matematicas {
	
	private double numero;

	//getters y setters
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double calcularRaizCuadrada() {
		return Math.sqrt(numero);
	}
	
	public double calcularRaizCubica() {
		return Math.abs(Math.cbrt(numero));
	}
	public int redondearAEntero() {
		return (int) Math.round(numero);
	}
	
	public int obtenerNumeroAleatorio() {
		return (int) Math.round( (redondearAEntero() * Math.random()));
	}
	
}
