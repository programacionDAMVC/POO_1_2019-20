// a · x² + b · x + c = 0    
//Ejemplos -3 · x² -1 · x + 2 = 0 (a = 3, b = 1, c = 2)
//Ejemplo: x² -7 = 0 (a = 1, b = 0, c = -7)
package ejercicios.ejercicio8;

public class TestEcuacionSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcuacionSengudoGrado e1 = new EcuacionSengudoGrado(-3, 1, 2);
		//comprobamos si se puede resolver
		if (e1.esResoluble()) {
			System.out.printf("Soluciones %.2f y %.2f%n", e1.calcularX1(), e1.calcularX2());
		}
		else
			System.out.println("No se puede resolver");
		
		EcuacionSengudoGrado e2 = new EcuacionSengudoGrado(1, 0, -7);
		//comprobamos si se puede resolver
		if (e2.esResoluble()) {
			System.out.printf("Soluciones %.2f y %.2f%n", e2.calcularX1(), e2.calcularX2());
		}
		else
			System.out.println("No se puede resolver");
	}
 
}
