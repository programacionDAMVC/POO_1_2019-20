package teoria;

public class TestCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(); //creamos objeto Circulo con valores por defecto
		System.out.println(c1.toString());
		c1.setRadio(7); //cambiamos el valor de radio de 1 a 7
		System.out.println(c1); //mostrar la referencia, hacemos que se comporte como un String
		Circulo c2 = new Circulo();
		c2.setRadio(10);
		System.out.printf("Círculo de radio %d, de área %.2f y de longitud %.2f%n", 
				c2.getRadio(), c2.getArea(), c2.getPerimetro());
	}

}
