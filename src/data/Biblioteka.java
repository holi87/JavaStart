package data;

public class Biblioteka {

	public static final int MAX_KSIAZKI = 1000;
	public static final int MAX_MAGAZYNY = 1000;

	private Ksiazka[] ksiazki;
	private Magazyn[] magazyny;

	private int numerKsiazki;
	private int numerMagazynu;

	public int getNumerKsiazki() {
		return numerKsiazki;
	}

	public Ksiazka[] getKsiazki() {
		return ksiazki;
	}

	public int getNumerMagazynu() {
		return numerMagazynu;
	}

	public Magazyn[] getMagazyny() {
		return magazyny;
	}

	public Biblioteka() {
		ksiazki = new Ksiazka[MAX_KSIAZKI];
		magazyny = new Magazyn[MAX_MAGAZYNY];
	}

	public void dodajKsiazke(Ksiazka ksiazka) {
		if (numerKsiazki < MAX_KSIAZKI) {
			ksiazki[numerKsiazki] = ksiazka;
			numerKsiazki++;
		} else {
			System.out.println("Maksymalna liczba książek została osiągnięta");
		}
	}

	public void dodajMagazyn(Magazyn magazyn) {
		if (numerMagazynu < MAX_MAGAZYNY) {
			magazyny[numerMagazynu] = magazyn;
			numerMagazynu++;
		} else {
			System.out.println("Maksymalna liczba magazynów została osiągnięta");
		}
	}

	public void wyswietlKsiazki() {
		if (numerKsiazki == 0) {
			System.out.println("Brak książek w bibliotece");
		}
		for (int i = 0; i < numerKsiazki; i++) {
			System.out.println(ksiazki[i]);
		}
	}

	public void wyswietlMagazyny() {
		if (numerMagazynu == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
		for (int i = 0; i < numerMagazynu; i++) {
			System.out.println(magazyny[i]);
		}
	}
}
