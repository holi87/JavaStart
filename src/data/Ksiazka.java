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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + iloscStron;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ksiazka other = (Ksiazka) obj;
		if (autor == null) {
			if (other.autor != null) {
				return false;
			}
		} else if (!autor.equals(other.autor)) {
			return false;
		}
		if (iloscStron != other.iloscStron) {
			return false;
		}
		if (isbn == null) {
			if (other.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(other.isbn)) {
			return false;
		}
		return true;
	}

	// konstruktory
	public Ksiazka(String ksiazkaTytul, String ksiazkaAutor, int ksiazkaRokWydania, int ksiazkaIloscStron,
			String ksiazkaWydawca, String ksiazkaISBN) {
		super(ksiazkaTytul, ksiazkaWydawca, ksiazkaRokWydania);
		setAutor(ksiazkaAutor);
		setIloscStron(ksiazkaIloscStron);
		setISBN(ksiazkaISBN);
	}

	public Ksiazka(Ksiazka ksiazka) {
		this(ksiazka.getTytul(), ksiazka.getAutor(), ksiazka.getRokWydania(), ksiazka.getIloscStron(),
				ksiazka.getWydawca(), ksiazka.getISBN());
	}

	@Override
	public String toString() {
		StringBuilder wyswietl = new StringBuilder(32);
		wyswietl.append(getTytul());
		wyswietl.append("; ");
		wyswietl.append(getAutor());
		wyswietl.append("; ");
		wyswietl.append(getRokWydania());
		wyswietl.append("; ");
		wyswietl.append(getIloscStron());
		wyswietl.append("; ");
		wyswietl.append(getWydawca());
		wyswietl.append("; ");
		wyswietl.append(getISBN());
		return wyswietl.toString();
	}

}
