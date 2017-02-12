
public class TabliceWielowymiaroweZadanie {

	public static void main(String[] args) {
		double tablica[][] = new double[3][3];
		tablica [0][0] = 1.0;
		tablica [0][1] = 1.5;
		tablica [0][2] = 2.0;

		tablica [1][0] = 1.5;
		tablica [1][1] = 2.0;
		tablica [1][2] = 2.5;
		
		tablica [2][0] = 2.0;
		tablica [2][1] = 2.5;
		tablica [2][2] = 3.0;
		
		double sumaIloczynow = tablica[0][0] * tablica [1][1] * tablica [2][2] + tablica[0][2] + tablica [1][1] + tablica [2][0];
		double iloczynSum = (tablica[1][0] + tablica [1][1] + tablica[1][2])  * (tablica[0][1] + tablica[1][1] + tablica[2][1]);
		double sumaWszystkichBezSrodka = tablica[0][0] + tablica[0][1] + tablica[0][2] + tablica [1][0] + tablica [1][2] + tablica[2][0]
				+ tablica[2][1] + tablica[2][2];
		
		System.out.println(sumaIloczynow + " " + iloczynSum + " " + sumaWszystkichBezSrodka);
		
	}

}
