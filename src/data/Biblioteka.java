package data;

public class Biblioteka {

	public static final int MAX_KSIAZKI = 1000;
	private Ksiazka[] ksiazki;
	private int numerKsiazki;

	public int getNumerKsiazki() {
		return numerKsiazki;
	}

	public Ksiazka[] getKsiazki() {
		return ksiazki;
	}

	public Biblioteka() {
		ksiazki = new Ksiazka[MAX_KSIAZKI];
	}

	public void dodajKsiazke(Ksiazka ksiazka) {
		if (numerKsiazki < MAX_KSIAZKI) {
			ksiazki[numerKsiazki] = ksiazka;
			numerKsiazki++;
		} else {
			System.out.println("Maksymalna liczba książek została osiągnięta");
		}
	}

	public void wyswietlKsiazki() {
		if (numerKsiazki == 0) {
			System.out.println("Brak książek w bibliotece");
		}
		for (int i = 0; i < numerKsiazki; i++) {
			ksiazki[i].printInfo();
		}
	}
}
