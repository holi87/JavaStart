package app;

public enum Opcje {
	WYJDZ(0, "Wyjście z programu"), DODAJ_KSIAZKE(1, "Dodanie nowej książki"), DODAJ_MAGAZYN(2,
			"Dodanie nowego magazynu"), WYSWIETL_KSIAZKI(3,
					"Wyświetl dostępne książki"), WYSWIETL_MAGAZYNY(4, "Wyświetl dostępne magazyny");

	private int wartosc;
	private String opis;

	public int getWartosc() {
		return wartosc;
	}

	public String getOpis() {
		return opis;
	}

	Opcje(int wartosc, String opis) {
		this.wartosc = wartosc;
		this.opis = opis;
	}

	@Override
	public String toString() {
		return wartosc + " " + opis;
	}

	public static Opcje utworzZInt(int opcja) {
		return Opcje.values()[opcja];
	}

}
