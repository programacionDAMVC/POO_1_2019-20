package ejercicios.ejercicio1;

public class Coche {
	
	private double cantidadCombustible = 5;
	private double consumoAlos100 = 7;
	
	public double getCantidadCombustible() {
		return cantidadCombustible;
	}
	
	public void annadirCombutible(double nuevoCombustible) {
		cantidadCombustible += nuevoCombustible;
	}
	
	public double kilometroARecorrer() {
		return cantidadCombustible / consumoAlos100 * 100 ;
	}
	
	
	
}
