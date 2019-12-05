package ejercicios.ejercicio2;

public class TestLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("121212", "Libro java", "pepito pérez", 100);
		System.out.println(libro1);
		libro1.setNumeroPaginas(200);
		System.out.println(libro1);
		System.out.printf("El libro %S es del autor %s%n", libro1.getTituloLibro(), libro1.getAutor());
	}

}
