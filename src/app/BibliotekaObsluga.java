package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.Biblioteka;
import data.Ksiazka;
import data.Magazyn;
import utilis.BibliotekaUtilis;
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
		Opcje opcja = null;
		while ((opcja != Opcje.WYJDZ)) {
			try {
				wyswietlOpcje();
				opcja = Opcje.utworzZInt(zczytywacz.getInt());
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

			} catch (InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
			} catch (NumberFormatException | NoSuchElementException e) {
				System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
			}
		}
		zczytywacz.zamknij();

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
		BibliotekaUtilis.wyswietlKsiazki(biblio);
	}

	private void wyswietlMagazyny() {
		BibliotekaUtilis.wyswietlMagazyny(biblio);
	}

}
