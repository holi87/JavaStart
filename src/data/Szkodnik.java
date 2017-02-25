package data;

import java.io.Serializable;

public abstract class Szkodnik implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7238573601621459238L;

	private String imie;
	private String nazwisko;
	private String pesel;

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Szkodnik(String imie, String nazwisko, String pesel) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		Szkodnik other = (Szkodnik) obj;
		if (imie == null) {
			if (other.imie != null) {
				return false;
			}
		} else if (!imie.equals(other.imie)) {
			return false;
		}
		if (nazwisko == null) {
			if (other.nazwisko != null) {
				return false;
			}
		} else if (!nazwisko.equals(other.nazwisko)) {
			return false;
		}
		if (pesel == null) {
			if (other.pesel != null) {
				return false;
			}
		} else if (!pesel.equals(other.pesel)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko + " " + pesel;
	}

}
