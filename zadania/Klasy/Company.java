package Klasy;

public class Company {

	public static void main(String[] args) {
		Employee pracownik1 = new Employee();
		Employee pracownik2 = new Employee();
		Employee pracownik3 = new Employee();
		
		pracownik1.imie = "Marek";
		pracownik1.nazwisko = "Trubadur";
		pracownik1.rokUrodzenia = 1980;
		pracownik1.stazPracy = 12.5;
		
		pracownik2.imie = "Tomasz";
		pracownik2.nazwisko = "Marudny";
		pracownik2.rokUrodzenia = 1974;
		pracownik2.stazPracy = 13.5;
		
		pracownik3.imie = "Marta";
		pracownik3.nazwisko = "Dzika";
		pracownik3.rokUrodzenia = 1990;
		pracownik3.stazPracy = 1.5;
		
		System.out.println("Pracownik 1 to: " + pracownik1.imie +" "+  pracownik1.nazwisko + " urodzony w " + pracownik1.rokUrodzenia + ". Pracuje u nas "+pracownik1.stazPracy+"lat.");
		System.out.println("Pracownik 2 to: " + pracownik2.imie +" "+  pracownik2.nazwisko + " urodzony w " + pracownik2.rokUrodzenia + ". Pracuje u nas "+pracownik2.stazPracy+"lat.");
		System.out.println("Pracownik 3 to: " + pracownik3.imie +" "+  pracownik3.nazwisko + " urodzony w " + pracownik3.rokUrodzenia + ". Pracuje u nas "+pracownik3.stazPracy+"lat.");
		
	}

}
