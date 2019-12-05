package ejercicios.ejercicio9;

public class TrianguloRectangulo {
	
	private float cateto1;
	private float cateto2;
	
	public TrianguloRectangulo(float cateto1, float cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public float calcularHipotenusa() {
		return (float) Math.hypot(cateto1, cateto2);
	}
	
	public float calcularArea() {
		return cateto1 * cateto2 / 2;
	}
	
	public float calcularPerimetro() {
		return cateto1 + cateto2 + calcularHipotenusa();
	}

	@Override
	public String toString() {
		return String.format(
				"TrianguloRectangulo de lados %.2f, %.2f y %.2f%nDe área %.2f%nDe perimetro %.2f%n",
				cateto1, cateto2, calcularHipotenusa(), calcularArea(), calcularPerimetro());
	}
	
//	public static void main(String[] args) {
//		TrianguloRectangulo t = new TrianguloRectangulo(2.3f, 8.1f);
//		System.out.println(t);
//	}
	
	
	
}
