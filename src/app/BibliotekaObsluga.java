package app;

import data.Biblioteka;
import data.Ksiazka;
import utilis.DataReader;

public class BibliotekaObsluga {

	// stale do kontroli switcha

	public final int wyjdz = 0;
	public final int dodajKsiazke = 1;
	public final int wyswietlKsiazki = 2;

	// zmienna do komunikacji z userem

	private DataReader zczytywacz;

	// biblioteka z danymi

	private Biblioteka biblio;

	public BibliotekaObsluga() {
		zczytywacz = new DataReader();
		biblio = new Biblioteka();
	}

	// główna pętla z opcjami i interakcją

	public void petlaKontrolna() {
		int opcja;
		wyswietlOpcje();
		while ((opcja = zczytywacz.getInt()) != wyjdz) {
			switch (opcja) {
			case dodajKsiazke:
				dodajKsiazki();
				break;
			case wyswietlKsiazki:
				wyswietlKsiazki();
				break;
			default:
				System.out.println("Brak takiej opcji, wprowadź ponownie: ");
			}
			wyswietlOpcje();
		}

	}

	private void wyswietlOpcje() {
		System.out.println("Wybierz opcję: ");
		System.out.println("0 - wyjście z programu");
		System.out.println("1 - dodanie nowej książki");
		System.out.println("2 - wyświetl dostępne książki");
	}

	private void dodajKsiazki() {
		Ksiazka ksiazka = zczytywacz.zczytajOrazStworzKsiazke();
		biblio.dodajKsiazke(ksiazka);
	}

	private void wyswietlKsiazki() {
		biblio.wyswietlKsiazki();
	}

}
