package utilis;

import data.Biblioteka;
import data.Ksiazka;
import data.Magazyn;
import data.Publikacja;

public class BibliotekaUtilis {
	public static void wyswietlKsiazki(Biblioteka bib) {
		Publikacja[] publikacja = bib.getPublikacje();
		int numerPublikacji = bib.getNumerPublikacji();
		int liczKsiazki = 0;

		for (int i = 0; i < numerPublikacji; i++) {
			if (publikacja[i] instanceof Ksiazka) {
				System.out.println(publikacja[i]);
				liczKsiazki++;
			}
		}
		if (liczKsiazki == 0) {
			System.out.println("Brak ksiażek w bibliotece");
		}
	}

	public static void wyswietlMagazyny(Biblioteka bib) {
		Publikacja[] publikacja = bib.getPublikacje();
		int numerPublikacji = bib.getNumerPublikacji();
		int liczMagazyny = 0;

		for (int i = 0; i < numerPublikacji; i++) {
			if (publikacja[i] instanceof Magazyn) {
				System.out.println(publikacja[i]);
				liczMagazyny++;
			}
		}
		if (liczMagazyny == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}
}
