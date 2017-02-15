package data;

public class Magazyn extends Publikacja{
	private int miesiacWydania;
	private int dzienWydania;
	private String jezyk;
	
	
	// settery i gettery
	
	public void setMiesiacWydania(int miesiacWydania){
		this.miesiacWydania = miesiacWydania;
	}
	
	public int getMiesiacWydania(){
		return miesiacWydania;
	}
	
	public void setDzienWydania(int dzienWydania){
		this.dzienWydania = dzienWydania;
	}
	
	public int getDzienWydania(){
		return dzienWydania;
	}
	
	public void setJezyk(String jezyk){
		this.jezyk = jezyk;
	}
	
	public String getJezyk(){
		return jezyk;
	}
	
	public Magazyn(String tytul, String wydawca, String jezyk, int rokWydania, int miesiacWydania, int dzienWydania)
	{
		this.setTytul(tytul);
		this.setWydawca(wydawca);
		this.setJezyk(jezyk);
		this.setRokWydania(rokWydania);
		this.setMiesiacWydania(miesiacWydania);
		this.setDzienWydania(dzienWydania);
	}
	
	public void printInfo(){
		String info = getTytul() + "; " + getWydawca() + "; " + getRokWydania() + "; " + getMiesiacWydania() + "; "
				+ getDzienWydania() + "; " + getJezyk();
		System.out.println(info);
		
	}
}

