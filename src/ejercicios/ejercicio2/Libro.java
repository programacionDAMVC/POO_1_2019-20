package ejercicios.ejercicio2;

public class Libro {
	
	private String isbn;
	private String tituloLibro;
	private String autor;
	private int numeroPaginas;
	
	public Libro(String isbn, String tituloLibro, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.tituloLibro = tituloLibro;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return String.format("Libro [isbn=%s, tituloLibro=%s, autor=%s, numeroPaginas=%d]", isbn, tituloLibro, autor,
				numeroPaginas);
	}

//	@Override
//	public String toString() {
//		return "Libro [isbn=" + isbn + ", tituloLibro=" + tituloLibro + ", autor=" + autor + ", numeroPaginas="
//				+ numeroPaginas + "]";
//	}
	
	
	
	
	
	
	
	
}
