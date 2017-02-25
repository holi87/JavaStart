package data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Biblioteka implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7141279408104924077L;

	public static final int POCZATKOWA_WARTOSC = 1;

	private Publikacja[] publikacje;
	private int numerPublikacji;

	public static class AlfabetycznyKomparator implements Comparator<Publikacja> {

		@Override
		public int compare(Publikacja o1, Publikacja o2) {
			// TODO Auto-generated method stub
			if (o1 == null && o2 == null) {
				return 0;
			}
			if (o1 == null) {
				return 1;
			}
			if (o2 == null) {
				return -1;
			}
			return o1.getTytul().compareTo(o2.getTytul());
		}
	}

	public static class DatowyKopmarator implements Comparator<Publikacja> {
		@Override
		public int compare(Publikacja o1, Publikacja o2) {
			// TODO Auto-generated method stub
			if (o1 == null && o2 == null) {
				return 0;
			}
			if (o1 == null) {
				return 1;
			}
			if (o2 == null) {
				return -1;
			}
			Integer i1 = o1.getRokWydania();
			Integer i2 = o2.getRokWydania();
			return -i1.compareTo(i2);
		}
	}

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
