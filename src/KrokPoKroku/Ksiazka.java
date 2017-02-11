package KrokPoKroku;

public class Ksiazka {
	String tytul;
	String autor;
	int dataWydania;
	int iloscStron;
	String wydawca;
	String isbn;
	
	Ksiazka(String ksiazkaTytul, String ksiazkaAutor, int ksiazkaDataWydania, int ksiazkaIloscStron, String ksiazkaWydawca, String ksiazkaISBN){
		tytul = ksiazkaTytul;
		autor = ksiazkaAutor;
		dataWydania = ksiazkaDataWydania;
		iloscStron = ksiazkaIloscStron;
		wydawca = ksiazkaWydawca;
		isbn = ksiazkaISBN;
	}
	
	void printInfo(){
		String info = tytul + "; " + autor + "; " + dataWydania + "; " + iloscStron + "; " + wydawca + "; " + isbn;
		System.out.println(info);
	}
	

}
