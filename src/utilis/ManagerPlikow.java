package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Biblioteka;

public class ManagerPlikow {

	public static final String NAZWA_PLIKU = "biblio.o";

	public void zapiszBibliotekeDoPliku(Biblioteka biblio) {
		try (FileOutputStream fos = new FileOutputStream(NAZWA_PLIKU);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(biblio);

		} catch (FileNotFoundException e) {
			System.err.println("Nie odnaleziono pliku " + NAZWA_PLIKU);
		} catch (IOException e) {
			System.err.println("Błąd podczas zapisu danych do pliku " + NAZWA_PLIKU);
		}
	}

	public Biblioteka czytajBibliotekeZPliku() throws FileNotFoundException, IOException, ClassNotFoundException {
		Biblioteka biblio = null;
		try (FileInputStream fis = new FileInputStream(NAZWA_PLIKU); ObjectInputStream ois = new ObjectInputStream(fis);

		) {
			biblio = (Biblioteka) ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Nie odnaleziono pliku " + NAZWA_PLIKU);
			throw e;
		} catch (IOException e) {
			System.err.println("Błąd podczas zapisu danych do pliku " + NAZWA_PLIKU);
			throw e;
		} catch (ClassNotFoundException e) {
			System.err.println("Nieprawidłowy format pliku");
			throw e;
		}

		return biblio;
	}

}
