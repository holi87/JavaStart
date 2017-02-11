package KrokPoKroku;

public class Biblioteka {

	public static void main(String[] args) {
		final String nazwaAplikacji = "Biblioteka v0.2";
		
		Ksiazka ksiazka1 = new Ksiazka();
		
		ksiazka1.tytul = "W pustyni i w puszczy";
		ksiazka1.autor = "Henryk Sienkieiwcz";
		ksiazka1.dataWydania = 2010;
		ksiazka1.iloscStron = 296;
		ksiazka1.wydawca = "Greg";
		ksiazka1.isbn = "9788373271890";
		
		System.out.println(nazwaAplikacji);
		System.out.println("Książki dostępne w bibliotece:");
		System.out.println(ksiazka1.tytul);
		System.out.println(ksiazka1.autor);
		System.out.println(ksiazka1.dataWydania);
		System.out.println(ksiazka1.iloscStron);
		System.out.println(ksiazka1.wydawca);
		System.out.print(ksiazka1.isbn);

	}

}
