package teoria;

public class Circulo {
	//atributos
	private int radio = 1;

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getArea() {
			return Math.PI * Math.pow(radio, 2);
	}
	
	public double getPerimetro() {
		return 2.0 * Math.PI * radio;
	}

	@Override
	public String toString() {
		return String.format("Circulo radio %d, Area %.2f, Perimetro %.2f%n",
				radio, getArea(), getPerimetro());
	}

//	@Override
//	public String toString() {
//		return "Circulo radio: " + radio + ", Area: " + getArea() + ", Perimetro: "
//				+ getPerimetro();
//	}
	
	
	
}
