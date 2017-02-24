package utilis;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Ksiazka;
import data.Magazyn;

public class DataReader {
	private Scanner czytaj;

	public DataReader() {
		czytaj = new Scanner(System.in);
	}

	public void zamknij() {
		czytaj.close();
	}

	public int getInt() throws NumberFormatException {
		int numer = 0;
		try {
			numer = czytaj.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
		} finally {
			czytaj.nextLine();
		}
		return numer;
	}

	public Ksiazka zczytajOrazStworzKsiazke() throws InputMismatchException {
		System.out.println("Podaj tytuł: ");
		String tytul = czytaj.nextLine();
		System.out.println("Podaj autora: ");
		String autor = czytaj.nextLine();
		System.out.println("podaj wydawnictwo: ");
		String wydawca = czytaj.nextLine();
		System.out.println("podaj ISBN: ");
		String isbn = czytaj.nextLine();
		System.out.println("podaj rok wydania: ");
		int iloscStron = 0;
		int rokWydania = 0;
		try {
			rokWydania = czytaj.nextInt();
			czytaj.nextLine();
			System.out.println("podaj ilość stron: ");
			iloscStron = czytaj.nextInt();
			czytaj.nextLine();
		} catch (InputMismatchException e) {
			czytaj.nextLine();
			throw e;
		}

		return new Ksiazka(tytul, autor, rokWydania, iloscStron, wydawca, isbn);
	}

	public Magazyn zczytajOrazStworzMagazyn() throws InputMismatchException {
		System.out.println("Podaj tytuł:");
		String tytul = czytaj.nextLine();
		System.out.println("Podaj wydawnictwo:");
		String wydawca = czytaj.nextLine();
		System.out.println("Podaj język:");
		String jezyk = czytaj.nextLine();
		System.out.println("podaj rok wydania: ");
		int rokWydania = 0;
		int miesiacWydania = 0;
		int dzienWydania = 0;
		try {
			rokWydania = czytaj.nextInt();
			czytaj.nextLine();
			System.out.println("podaj miesiąc wydania: ");
			miesiacWydania = czytaj.nextInt();
			czytaj.nextLine();
			System.out.println("podaj dzień wydania: ");
			dzienWydania = czytaj.nextInt();
			czytaj.nextLine();
		} catch (InputMismatchException e) {
			czytaj.nextLine();
			throw e;
		}

		return new Magazyn(tytul, wydawca, jezyk, rokWydania, miesiacWydania, dzienWydania);
	}
}
