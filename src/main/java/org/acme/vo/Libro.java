package org.acme.vo;




public class Libro {
	
	private String titulo;
	private String autor;
	private String isbn;
	private String resegna;
	
	
	
	public Libro() {
		
	}



	public Libro(String titulo, String autor, String isbn, String resegna) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.resegna = resegna;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getResegna() {
		return resegna;
	}



	public void setResegna(String resegna) {
		this.resegna = resegna;
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", resegna=" + resegna + "]";
	}
    
	
   
    
    
}