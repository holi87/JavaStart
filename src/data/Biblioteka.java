package data;

import java.io.Serializable;
import java.util.Arrays;

public class Biblioteka implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7141279408104924077L;

	public static final int POCZATKOWA_WARTOSC = 1;

	private Publikacja[] publikacje;
	private int numerPublikacji;

	public int getNumerPublikacji() {
		return numerPublikacji;
	}

	public Publikacja[] getPublikacje() {
		return publikacje;
	}

	public Biblioteka() {
		publikacje = new Publikacja[POCZATKOWA_WARTOSC];
	}

	public void usunPublikacje(Publikacja publikacja) {
		if (publikacja == null) {
			return;
		}

		final int NIE_ZNALEZIONE = -1;
		int znalezione = NIE_ZNALEZIONE;
		int i = 0;
		while (i < publikacje.length && znalezione == NIE_ZNALEZIONE) {
			if (publikacja.equals(publikacje[i])) {
				znalezione = i;
			} else {
				i++;
			}
		}

		if (znalezione != NIE_ZNALEZIONE) {
			System.arraycopy(publikacje, znalezione + 1, publikacje, znalezione, publikacje.length - 1);
			numerPublikacji--;
		}
	}

	public void dodajPublikacje(Publikacja publikacja) {
		if (numerPublikacji == publikacje.length) {
			publikacje = Arrays.copyOf(publikacje, publikacje.length * 2);
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
