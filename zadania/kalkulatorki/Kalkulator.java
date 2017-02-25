package kalkulatorki;

public class Kalkulator {
	
	
	double dodaj(double skladnik1, double skladnik2){
		return skladnik1 + skladnik2;
	}

	double odejmij(double podstawa, double odejmowany){
		return podstawa - odejmowany;
	}
	
	double mnoz(double liczba1, double liczba2){
		return liczba1 * liczba2;
	}
	
	double podziel(double dzielna, double dzielnik){
		if (dzielnik != 0){
			return dzielna / dzielnik;
		}
		else{
			return 0;
		}
	}
}
