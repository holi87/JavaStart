package data;

public class Ksiazka {
	// zmienne
	private String tytul;
	private String autor;
	private int dataWydania;
	private int iloscStron;
	private String wydawca;
	private String isbn;

	// settery

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setDataWydania(int dataWydania) {
		this.dataWydania = dataWydania;
	}

	public void setIloscStron(int iloscStron) {
		this.iloscStron = iloscStron;
	}

	public void setWydawca(String wydawca) {
		this.wydawca = wydawca;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	// gettery
	public String getTytul() {
		return tytul;
	}

	public String getAutor() {
		return autor;
	}

	public int getDataWydania() {
		return dataWydania;
	}

	public int getIloscStron() {
		return iloscStron;
	}

	public String getWydawca() {
		return wydawca;
	}

	public String getISBN() {
		return isbn;
	}

	// konstruktory
	public Ksiazka(String ksiazkaTytul, String ksiazkaAutor, int ksiazkaDataWydania, int ksiazkaIloscStron,
			String ksiazkaWydawca, String ksiazkaISBN) {
		this.tytul = ksiazkaTytul;
		this.autor = ksiazkaAutor;
		this.dataWydania = ksiazkaDataWydania;
		this.iloscStron = ksiazkaIloscStron;
		this.wydawca = ksiazkaWydawca;
		this.isbn = ksiazkaISBN;
	}

	public Ksiazka(Ksiazka ksiazka) {
		this(ksiazka.getTytul(), ksiazka.getAutor(), ksiazka.getDataWydania(), ksiazka.getIloscStron(),
				ksiazka.getWydawca(), ksiazka.getISBN());
	}

	// wyswietlenie
	public void printInfo() {
		String info = getTytul() + "; " + getAutor() + "; " + getDataWydania() + "; " + getIloscStron() + "; "
				+ getWydawca() + "; " + getISBN();
		System.out.println(info);
	}

}
