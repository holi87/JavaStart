package data;

public class Publikacja {
	private int rokWydania;
	private String tytul;
	private String wydawca;

	// settery i gettery

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getTytul() {
		return tytul;
	}

	public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	}

	public int getRokWydania() {
		return rokWydania;
	}

	public void setWydawca(String wydawca) {
		this.wydawca = wydawca;
	}

	public String getWydawca() {
		return wydawca;
	}

}
