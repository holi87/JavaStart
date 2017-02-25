package utilis;

import java.util.Collection;

import data.Biblioteka;
import data.BibliotekaSzkodnikow;
import data.Ksiazka;
import data.Magazyn;
import data.Publikacja;

public class BibliotekaUtilis {
	public static void wyswietlKsiazki(Biblioteka bib) {
		Collection<Publikacja> publikacje = bib.getPublikacje().values();
		int liczKsiazki = 0;
		for (Publikacja p : publikacje) {
			if (p instanceof Ksiazka) {
				System.out.println(p);
				liczKsiazki++;
			}
		}

		if (liczKsiazki == 0) {
			System.out.println("Brak książek w bibliotece");
		}
	}

	public static void wyswietlMagazyny(Biblioteka bib) {
		Collection<Publikacja> publikacje = bib.getPublikacje().values();
		int liczMagazyny = 0;
		for (Publikacja p : publikacje) {
			if (p instanceof Magazyn) {
				System.out.println(p);
				liczMagazyny++;
			}
		}

		if (liczMagazyny == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}

	public static void wyswietlSzkodniki(Biblioteka bib) {
		Collection<BibliotekaSzkodnikow> szkodniki = bib.getSzkodnik().values();
		for (BibliotekaSzkodnikow s : szkodniki) {
			System.out.println(s);
		}
	}
}
