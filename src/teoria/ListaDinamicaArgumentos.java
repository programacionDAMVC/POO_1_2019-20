package teoria;

public class ListaDinamicaArgumentos {

	public static void main(String[] args) {
		imprimirLista(1,2,3,4,5,7,2);

	}
	
	public static void imprimirLista(int... lista) {
		for (int i : lista) {
			System.out.println(i);
		}
	}

}
