package data;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Biblioteka implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7141279408104924077L;

	public static final int POCZATKOWA_WARTOSC = 1;

	private Map<String, Publikacja> publikacje;
	private Map<String, BibliotekaSzkodnikow> szkodniki;

	public static class AlfabetycznyKomparator implements Comparator<Publikacja> {

		@Override
		public int compare(Publikacja o1, Publikacja o2) {
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
		return publikacje.size();
	}

	public Map<String, Publikacja> getPublikacje() {
		return publikacje;
	}

	public Map<String, BibliotekaSzkodnikow> getSzkodnik() {
		return szkodniki;
	}

	public Biblioteka() {
		publikacje = new HashMap<>();
		szkodniki = new HashMap<>();
	}

	public void dodajSzkodnika(BibliotekaSzkodnikow szkodnik) {
		szkodniki.put(szkodnik.getPesel(), szkodnik);
	}

	public void usunPublikacje(Publikacja publikacja) {
		if (publikacje.containsValue(publikacja)) {
			publikacje.remove(publikacja.getTytul());
		}
	}

	public void dodajPublikacje(Publikacja publikacja) {
		publikacje.put(publikacja.getTytul(), publikacja);
	}

	public void dodajKsiazke(Ksiazka ksiazka) {
		dodajPublikacje(ksiazka);

	}

	public void dodajMagazyn(Magazyn magazyn) {
		dodajPublikacje(magazyn);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Publikacja p : publikacje.values()) {
			builder.append(p);
			builder.append("\n");
		}
		return builder.toString();
	}

}
