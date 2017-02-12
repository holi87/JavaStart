package app;

import data.Ksiazka;

public class Biblioteka {

	public static void main(String[] args) {
		final String nazwaAplikacji = "Biblioteka v0.5";
		Ksiazka[] ksiazki = new Ksiazka[1000];
		ksiazki[0] = new Ksiazka("W pustyni i w puszczy", "Henryk Sienkieiwcz", 2010, 296, "Greg",
				"9788373271890");
		ksiazki[1] = new Ksiazka("Pajton", "noName", 2017, 1, "Nope", "lol");

		System.out.println(nazwaAplikacji);
		ksiazki[0].printInfo();
		ksiazki[1].printInfo();
		System.out.println("System może przechowywać do " + ksiazki.length + " książek.");
	}

}
