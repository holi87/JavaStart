package utilis;

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

	public int getInt() {
		int number = czytaj.nextInt();
		czytaj.nextLine();
		return number;
	}

	public Ksiazka zczytajOrazStworzKsiazke() {
		System.out.println("Podaj tytuł: ");
		String tytul = czytaj.nextLine();
		System.out.println("Podaj autora: ");
		String autor = czytaj.nextLine();
		System.out.println("podaj rok wydania: ");
		int rokWydania = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj ilość stron: ");
		int iloscStron = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj wydawnictwo: ");
		String wydawca = czytaj.nextLine();
		System.out.println("podaj ISBN: ");
		String isbn = czytaj.nextLine();

		return new Ksiazka(tytul, autor, rokWydania, iloscStron, wydawca, isbn);
	}

	public Magazyn zczytajOrazStworzMagazyn() {
		System.out.println("Podaj tytuł:");
		String tytul = czytaj.nextLine();
		System.out.println("Podaj wydawnictwo:");
		String wydawca = czytaj.nextLine();
		System.out.println("Podaj język:");
		String jezyk = czytaj.nextLine();
		System.out.println("podaj rok wydania: ");
		int rokWydania = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj miesiąc wydania: ");
		int miesiacWydania = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj dzień wydania: ");
		int dzienWydania = czytaj.nextInt();
		czytaj.nextLine();

		return new Magazyn(tytul, wydawca, jezyk, rokWydania, miesiacWydania, dzienWydania);
	}
}
