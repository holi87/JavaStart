package data;

public class Magazyn extends Publikacja {
	/**
	 *
	 */
	private static final long serialVersionUID = -8146517503851993887L;
	private int miesiacWydania;
	private int dzienWydania;
	private String jezyk;

	// settery i gettery

	public void setMiesiacWydania(int miesiacWydania) {
		this.miesiacWydania = miesiacWydania;
	}

	public int getMiesiacWydania() {
		return miesiacWydania;
	}

	public void setDzienWydania(int dzienWydania) {
		this.dzienWydania = dzienWydania;
	}

	public int getDzienWydania() {
		return dzienWydania;
	}

	public void setJezyk(String jezyk) {
		this.jezyk = jezyk;
	}

	public String getJezyk() {
		return jezyk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + dzienWydania;
		result = prime * result + ((jezyk == null) ? 0 : jezyk.hashCode());
		result = prime * result + miesiacWydania;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Magazyn)) {
			return false;
		}
		Magazyn other = (Magazyn) obj;
		if (dzienWydania != other.dzienWydania) {
			return false;
		}
		if (jezyk == null) {
			if (other.jezyk != null) {
				return false;
			}
		} else if (!jezyk.equals(other.jezyk)) {
			return false;
		}
		if (miesiacWydania != other.miesiacWydania) {
			return false;
		}
		return true;
	}

	public Magazyn(String tytul, String wydawca, String jezyk, int rokWydania, int miesiacWydania, int dzienWydania) {
		super(tytul, wydawca, rokWydania);
		setJezyk(jezyk);
		setMiesiacWydania(miesiacWydania);
		setDzienWydania(dzienWydania);
	}

	@Override
	public String toString() {
		StringBuilder wyswietl = new StringBuilder(32);
		wyswietl.append(getTytul());
		wyswietl.append("; ");
		wyswietl.append(getWydawca());
		wyswietl.append("; ");
		wyswietl.append(getRokWydania());
		wyswietl.append("; ");
		wyswietl.append(getMiesiacWydania());
		wyswietl.append("; ");
		wyswietl.append(getDzienWydania());
		wyswietl.append("; ");
		wyswietl.append(getJezyk());
		return wyswietl.toString();

	}

}
