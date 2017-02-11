package kalkulatorki;

public class Oblicz {

	public static void main(String[] args) {
		double a = 25;
		double b = 4;
		Kalkulator calc = new Kalkulator();
		System.out.println(calc.dodaj(a, b));
		System.out.println(calc.odejmij(a, b));
		System.out.println(calc.mnoz(a, b));
		System.out.println(calc.podziel(a, b));
	}

}
