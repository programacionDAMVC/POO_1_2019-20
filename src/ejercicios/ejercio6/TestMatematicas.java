package ejercicios.ejercio6;
import java.util.Scanner;

public class TestMatematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		double numero =  sc.nextDouble();
		sc.close();
		Matematicas matematicas = new Matematicas();
		matematicas.setNumero(numero);
		System.out.printf("%.2f su raíz cuadrada es %.2f y la raíz cúbicas vale %.2f%n", 
							matematicas.getNumero(), matematicas.calcularRaizCuadrada(),
							matematicas.calcularRaizCubica());
		System.out.printf("%.2f redondeado a entero es %d%n", matematicas.getNumero(), 
							matematicas.redondearAEntero());
		System.out.printf("Nº aleatorio entre 0 y %d es %d%n", matematicas.redondearAEntero(),
				matematicas.obtenerNumeroAleatorio());
	}
}
