package teoria;
public class Rectangulo {
	private int alto  = 2;
	private int ancho = 1;
	
	//getters y setters
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	//calcular área 
	public int getArea () {
		return alto * ancho;
	}
	//calcular perímetro
	public int getPerimetro() {
		return alto * 2 + ancho * 2;				 
	}
	@Override
	public String toString() {
		return "Soy un rectángulo, alto=" + alto + ", ancho=" + ancho;
	}
	
	
}
