package KrokPoKroku;

public class Biblioteka {

	public static void main(String[] args) {
		final String nazwaAplikacji = "Biblioteka v0.3";
		
		Ksiazka ksiazka1 = new Ksiazka("W pustyni i w puszczy", "Henryk Sienkieiwcz", 2010, 296, "Greg", "9788373271890");
		Ksiazka ksiazka2 = new Ksiazka("Pajton", "noName", 2017, 1, "Nope", "lol");
		
		System.out.println(nazwaAplikacji);
		ksiazka1.printInfo();
		ksiazka2.printInfo();
		
	}

}
