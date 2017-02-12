package app;

import data.Ksiazka;
import utilis.DataReader;

public class Biblioteka {

	public static void main(String[] args) {
		final String nazwaAplikacji = "Biblioteka v0.6";
		Ksiazka[] ksiazki = new Ksiazka[1000];
		DataReader zczytywacz = new DataReader();

		System.out.println(nazwaAplikacji);
		System.out.println("Wprowadz nowa ksiazke");
		
		ksiazki[0] = zczytywacz.zczytajOrazStworzKsiazke();
		ksiazki[1] = zczytywacz.zczytajOrazStworzKsiazke();
		
		zczytywacz.zamknij();
		
		ksiazki[0].printInfo();
		ksiazki[1].printInfo();
		
		
		System.out.println("System może przechowywać do " + ksiazki.length + " książek.");
	}

}
