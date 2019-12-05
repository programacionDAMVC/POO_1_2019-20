package teoria;

public class Ejemplo {

	public static void main(String[] args) {
		Numero n1 = new Numero(15);
		System.out.println(n1);
		Numero n2 = new Numero(15.0);
		System.out.println(n2);
	}
}

class Numero {
	
	private double valor;

	public Numero(double valor) {
		System.out.println("Constructor con parámetro double");
		this.valor = valor;
	}
	public Numero(int valor) {
		System.out.println("Constructor con parámetro int");
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Creado número con valor " + valor;
	}
}
