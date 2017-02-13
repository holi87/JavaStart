package utilis;

import java.util.Scanner;

import data.Ksiazka;

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
		System.out.println("podaj datę wydania: ");
		int dataWydania = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj ilość stron: ");
		int iloscStron = czytaj.nextInt();
		czytaj.nextLine();
		System.out.println("podaj wydawnictwo: ");
		String wydawca = czytaj.nextLine();
		System.out.println("podaj ISBN: ");
		String isbn = czytaj.nextLine();

		return new Ksiazka(tytul, autor, dataWydania, iloscStron, wydawca, isbn);
	}

}
