package data;

import java.util.ArrayList;
import java.util.List;

public class BibliotekaSzkodnikow extends Szkodnik {

	/**
	 *
	 */
	private static final long serialVersionUID = 8052371859191478274L;

	private List<Publikacja> historiaPublikacji;
	private List<Publikacja> wypozyczonePublikacje;

	public List<Publikacja> getHistoriaPublikacji() {
		return historiaPublikacji;
	}

	public void setHistoriaPublikacji(List<Publikacja> historiaPublikacji) {
		this.historiaPublikacji = historiaPublikacji;
	}

	public List<Publikacja> getWypozyczonePublikacje() {
		return wypozyczonePublikacje;
	}

	public void setWypozyczonePublikacje(List<Publikacja> wypozyczonePublikacje) {
		this.wypozyczonePublikacje = wypozyczonePublikacje;
	}

	public BibliotekaSzkodnikow(String imie, String nazwisko, String pesel) {
		super(imie, nazwisko, pesel);
		historiaPublikacji = new ArrayList<>();
		wypozyczonePublikacje = new ArrayList<>();
	}

	private void dodajPublikacjeDoHistorii(Publikacja publikacja) {
		historiaPublikacji.add(publikacja);
	}

	public void wypozyczPublikacje(Publikacja pub) {
		wypozyczonePublikacje.add(pub);
	}

	public boolean oddajPublikacje(Publikacja publik) {
		boolean wynik = false;
		if (wypozyczonePublikacje.remove(publik)) {
			wynik = true;
			dodajPublikacjeDoHistorii(publik);
		}

		return wynik;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((historiaPublikacji == null) ? 0 : historiaPublikacji.hashCode());
		result = prime * result + ((wypozyczonePublikacje == null) ? 0 : wypozyczonePublikacje.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		BibliotekaSzkodnikow other = (BibliotekaSzkodnikow) obj;
		if (historiaPublikacji == null) {
			if (other.historiaPublikacji != null) {
				return false;
			}
		} else if (!historiaPublikacji.equals(other.historiaPublikacji)) {
			return false;
		}
		if (wypozyczonePublikacje == null) {
			if (other.wypozyczonePublikacje != null) {
				return false;
			}
		} else if (!wypozyczonePublikacje.equals(other.wypozyczonePublikacje)) {
			return false;
		}
		return true;
	}

}
