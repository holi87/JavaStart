package data;

public class Biblioteka {

	public static final int MAX_PUBLIKACJI = 2000;

	private Publikacja[] publikacje;
	private int numerPublikacji;

	public int getNumerPublikacji() {
		return numerPublikacji;
	}

	public Publikacja[] getPublikacje() {
		return publikacje;
	}

	public Biblioteka() {
		publikacje = new Publikacja[MAX_PUBLIKACJI];
	}

	public void dodajPublikacje(Publikacja publikacja) {
		if (numerPublikacji < MAX_PUBLIKACJI) {
			publikacje[numerPublikacji] = publikacja;
			numerPublikacji++;
		} else {
			System.out.println("Maxymalna liczba publikacji została osiągnięta");
		}
	}

	public void dodajKsiazke(Ksiazka ksiazka) {
		dodajPublikacje(ksiazka);

	}

	public void dodajMagazyn(Magazyn magazyn) {
		dodajPublikacje(magazyn);
	}

	public void wyswietlKsiazki() {
		int liczKsiazki = 0;
		for (int i = 0; i < numerPublikacji; i++) {
			if (publikacje[i] instanceof Ksiazka) {
				System.out.println(publikacje[i]);
				liczKsiazki++;
			}
		}
		if (liczKsiazki == 0) {
			System.out.println("Brak książek w bibliotece");
		}
	}

	public void wyswietlMagazyny() {
		int liczMagazyny = 0;
		for (int i = 0; i < numerPublikacji; i++) {
			if (publikacje[i] instanceof Magazyn) {
				System.out.println(publikacje[i]);
				liczMagazyny++;
			}
		}
		if (liczMagazyny == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}
}
