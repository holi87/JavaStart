package app;

public class BibliotekaAplikacja {

	public static void main(String[] args) {
		final String nazwaAplikacji = "Biblioteka v0.92";
		System.out.println(nazwaAplikacji);

		BibliotekaObsluga obslugabiblio = new BibliotekaObsluga();
		obslugabiblio.petlaKontrolna();

	}

}
