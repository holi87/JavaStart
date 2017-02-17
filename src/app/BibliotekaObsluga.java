package app;

import data.Biblioteka;
import data.Ksiazka;
import data.Magazyn;
import utilis.DataReader;

public class BibliotekaObsluga {

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
		Opcje opcja;
		wyswietlOpcje();
		while ((opcja = Opcje.utworzZInt(zczytywacz.getInt())) != Opcje.WYJDZ) {
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
			case WYJDZ:
				;
			}
			wyswietlOpcje();
		}

	}

	private void wyswietlOpcje() {
		System.out.println("Wybierz opcję: ");
		for (Opcje o : Opcje.values()) {
			System.out.println(o);
		}
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
