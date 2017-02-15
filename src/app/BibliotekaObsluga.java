package app;

import data.Biblioteka;
import data.Ksiazka;
import data.Magazyn;
import utilis.DataReader;

public class BibliotekaObsluga {

	// stale do kontroli switcha

	public static final int WYJDZ = 0;
	public static final int DODAJ_KSIAZKE = 1;
	public static final int DODAJ_MAGAZYN = 2;
	public static final int WYSWIETL_KSIAZKI = 3;
	public static final int WYSWIETL_MAGAZYNY = 4;
	


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
		while ((opcja = zczytywacz.getInt()) != WYJDZ) {
			switch (opcja) {
			case DODAJ_KSIAZKE:
				dodajKsiazki();
				break;
			case DODAJ_MAGAZYN:
				dodajMagazyn();
				break;
			case WYSWIETL_KSIAZKI:
				wyswietlKsiazki();
				break;
			case WYSWIETL_MAGAZYNY:
				wyswietlMagazyny();
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
		System.out.println("2 - dodanie nowego magazynu");
		System.out.println("3 - wyświetl dostępne książki");	
		System.out.println("4 - wyświetl dostępne magazyny");
	}

	private void dodajKsiazki() {
		Ksiazka ksiazka = zczytywacz.zczytajOrazStworzKsiazke();
		biblio.dodajKsiazke(ksiazka);
	}

	private void dodajMagazyn() {
		Magazyn magazyn = zczytywacz.zczytajOrazStworzMagazyn();
		biblio.dodajMagazyn(magazyn);
	}

	
	private void wyswietlKsiazki() {
		biblio.wyswietlKsiazki();
	}

	private void wyswietlMagazyny() {
		biblio.wyswietlMagazyny();
	}

}
