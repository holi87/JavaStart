package data;

public class Ksiazka extends Publikacja {
	// zmienne

	private String autor;
	private int iloscStron;
	private String isbn;

	// settery

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setIloscStron(int iloscStron) {
		this.iloscStron = iloscStron;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	// gettery

	public String getAutor() {
		return autor;
	}

	public int getIloscStron() {
		return iloscStron;
	}

	public String getISBN() {
		return isbn;
	}

	// konstruktory
	public Ksiazka(String ksiazkaTytul, String ksiazkaAutor, int ksiazkaRokWydania, int ksiazkaIloscStron,
			String ksiazkaWydawca, String ksiazkaISBN) {
		this.setTytul(ksiazkaTytul);
		this.setAutor(ksiazkaAutor);
		this.setRokWydania(ksiazkaRokWydania);
		this.setIloscStron(ksiazkaIloscStron);
		this.setWydawca(ksiazkaWydawca);
		this.setISBN(ksiazkaISBN);
	}

	public Ksiazka(Ksiazka ksiazka) {
		this(ksiazka.getTytul(), ksiazka.getAutor(), ksiazka.getRokWydania(), ksiazka.getIloscStron(),
				ksiazka.getWydawca(), ksiazka.getISBN());
	}

	// wyswietlenie
	public void printInfo() {
		String info = getTytul() + "; " + getAutor() + "; " + getRokWydania() + "; " + getIloscStron() + "; "
				+ getWydawca() + "; " + getISBN();
		System.out.println(info);
	}

}
