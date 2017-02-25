package data;

import java.io.Serializable;

public class Biblioteka implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7141279408104924077L;

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
		if (numerPublikacji == MAX_PUBLIKACJI) {
			throw new ArrayIndexOutOfBoundsException("Maksymalna ilość publikacji: " + MAX_PUBLIKACJI);
		} else {
			publikacje[numerPublikacji] = publikacja;
			numerPublikacji++;
		}
	}

	public void dodajKsiazke(Ksiazka ksiazka) {
		dodajPublikacje(ksiazka);

	}

	public void dodajMagazyn(Magazyn magazyn) {
		dodajPublikacje(magazyn);
	}

}
