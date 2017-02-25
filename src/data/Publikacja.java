package data;

import java.io.Serializable;

public abstract class Publikacja implements Serializable, Comparable<Publikacja> {
	/**
	 *
	 */

	@Override
	public int compareTo(Publikacja o) {
		return tytul.compareTo(o.getTytul());
	}

	private static final long serialVersionUID = -2742749806169492138L;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rokWydania;
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
		result = prime * result + ((wydawca == null) ? 0 : wydawca.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Publikacja)) {
			return false;
		}
		Publikacja other = (Publikacja) obj;
		if (rokWydania != other.rokWydania) {
			return false;
		}
		if (tytul == null) {
			if (other.tytul != null) {
				return false;
			}
		} else if (!tytul.equals(other.tytul)) {
			return false;
		}
		if (wydawca == null) {
			if (other.wydawca != null) {
				return false;
			}
		} else if (!wydawca.equals(other.wydawca)) {
			return false;
		}
		return true;
	}

	protected Publikacja(String tytul, String wydawca, int rokWydania) {
		setTytul(tytul);
		setWydawca(wydawca);
		setRokWydania(rokWydania);

	}
}
