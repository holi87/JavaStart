package KrokPoKroku;

public class Ksiazka {
	String tytul;
	String autor;
	int dataWydania;
	int iloscStron;
	String wydawca;
	String isbn;
	
	Ksiazka(String ksiazkaTytul, String ksiazkaAutor, int ksiazkaDataWydania, int ksiazkaIloscStron, String ksiazkaWydawca, String ksiazkaISBN){
		this.tytul = ksiazkaTytul;
		this.autor = ksiazkaAutor;
		this.dataWydania = ksiazkaDataWydania;
		this.iloscStron = ksiazkaIloscStron;
		this.wydawca = ksiazkaWydawca;
		this.isbn = ksiazkaISBN;
	}
	
	Ksiazka(Ksiazka ksiazka){
		this(ksiazka.tytul, ksiazka.autor, ksiazka.dataWydania, ksiazka.iloscStron,ksiazka.wydawca, ksiazka.isbn);
	}
	
	void printInfo(){
		String info = tytul + "; " + autor + "; " + dataWydania + "; " + iloscStron + "; " + wydawca + "; " + isbn;
		System.out.println(info);
	}
	

}
