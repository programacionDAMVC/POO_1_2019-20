package ejercicios.ejercicio1;

public class TestCoche {
	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		c1.annadirCombutible(10.2);
		c2.annadirCombutible(2);
		System.out.printf("Coche 1, con %.2f litros de combustible y puede recorrer"
				+ " %.2f kilómetros%n" , c1.getCantidadCombustible(), c1.kilometroARecorrer());
		System.out.printf("Coche 2, con %.2f litros de combustible y puede recorrer"
				+ " %.2f kilómetros%n" , c2.getCantidadCombustible(), c2.kilometroARecorrer());

	}
}
