package ejercicios.ejercicio4;
import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		String palabraLeida = sc.next();
	//	String palabraLeida = "";
	//	String palabraLeida = "  palabraConEspaciosBlancos    ";
		
		Palabra palabra = new Palabra(palabraLeida);
		System.out.printf("%n%nPalabra leida %s%n"
						+ " su valor en mayúscula %s%n"
						+ " su valor en minúscula %s%n"
						+ " nº de letra que tiene %d%n"
						+ " su primera letra es:  %c%n"
						+ " su última letra en mayúscula: %c%n%n%n",
				palabraLeida, palabra.obtenerPalabraMayuscula(), palabra.obtenerPalabraMinuscula(),
				palabra.obtenerNumeroLetrasDePalabra(), palabra.obtenerPrimeraLetraDePalabra(),
				palabra.obtenerUltimaLetraDePalabraEnMayuscula());
		
		System.out.println("Introduce un caracter a reemplazar");
		String caracterARemplazar = sc.next();
		System.out.println("Introduce un caracter de reemplazo");
		String caracterDeRemplazo = sc.next();
		System.out.printf("En la cadena %s si cambio %s por %s queda %s%n",
				palabraLeida, caracterARemplazar, caracterDeRemplazo, 
				palabra.remplazarLetrasDePalabra(caracterARemplazar, caracterDeRemplazo));
		sc.close();

	}

}
