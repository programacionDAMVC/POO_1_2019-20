package ejercicios.ejercicio4;

public class Palabra {
	//atributo: contenido de la palabra
	private String contenidoPalabra;

	//constructor
	public Palabra(String contenidoPalabra) {
		this.contenidoPalabra = contenidoPalabra.trim();
	}
	
	//resto de métodos
	public String obtenerPalabraMayuscula() {
		return contenidoPalabra.toUpperCase();
	}
	public String obtenerPalabraMinuscula() {
		return contenidoPalabra.toLowerCase();
	}
	public int obtenerNumeroLetrasDePalabra() {
		return contenidoPalabra.length();
	}
	public String remplazarLetrasDePalabra(String caracterARemplazar, String caracterRemplazo) {
		return contenidoPalabra.replace(caracterARemplazar, caracterRemplazo);
	}
	public char obtenerPrimeraLetraDePalabra() {
		if (contenidoPalabra.length() != 0)
			return contenidoPalabra.charAt(0);
		else
			return ' ';
	}
	public char obtenerUltimaLetraDePalabraEnMayuscula() {
		if (contenidoPalabra.length() != 0)
			return contenidoPalabra.toUpperCase().charAt(contenidoPalabra.length() - 1);
		return ' ';
	}
	
	
	
	
}
