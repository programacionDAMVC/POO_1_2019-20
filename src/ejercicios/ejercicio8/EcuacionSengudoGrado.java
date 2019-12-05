// a · x² + b · x + c = 0    
//Ejemplos 3 · x² -1 · x + 2 = 0 (a = 3, b = -1, c = 2)
//Ejemplo: x² -7 = 0 (a = 1, b = 0, c = -7)

package ejercicios.ejercicio8;

public class EcuacionSengudoGrado {
	
	private double a;
	private double b;
	private double c;
	
	public EcuacionSengudoGrado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean esResoluble() {
		return b * b - 4 * a * c >= 0 && a != 0;
	}
	
	public double calcularX1() {
		return (-b + Math.sqrt(b * b - 4 * a * c)) / (  2 * a );
	}

	public double calcularX2() {
		return (-b - Math.sqrt(b * b - 4 * a * c)) / ( 2 * a );
	}

}
