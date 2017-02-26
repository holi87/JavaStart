package utilis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import data.Biblioteka;
import data.BibliotekaSzkodnikow;
import data.Ksiazka;
import data.Magazyn;
import data.Publikacja;

public class BibliotekaUtilis {
	public static void wyswietlKsiazki(Biblioteka bib) {
		List<Publikacja> publikacje = new ArrayList<>();
		publikacje.addAll(bib.getPublikacje().values());
		Collections.sort(publikacje, new Biblioteka.AlfabetycznyKomparator());
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
		List<Publikacja> publikacje = new ArrayList<>();
		publikacje.addAll(bib.getPublikacje().values());
		Collections.sort(publikacje, new Biblioteka.AlfabetycznyKomparator());

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
		List<BibliotekaSzkodnikow> szkodniki = new ArrayList<>();
		szkodniki.addAll(bib.getSzkodnik().values());

		Collections.sort(szkodniki, new Comparator<BibliotekaSzkodnikow>() {
			@Override
			public int compare(BibliotekaSzkodnikow o1, BibliotekaSzkodnikow o2) {
				return o1.getNazwisko().compareTo(o2.getNazwisko());
			}
		});
		for (BibliotekaSzkodnikow s : szkodniki) {
			System.out.println(s);
		}
	}
}
