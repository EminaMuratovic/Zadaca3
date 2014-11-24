import java.util.Arrays;

public class OdManjegKaNajvecem {
	public static void main(String[] args) {
		int prvi, drugi, treci, brojac = 0, max, niz[];
		System.out.println("Unesite tri broja: ");
		prvi = TextIO.getInt();
		drugi = TextIO.getInt();
		treci = TextIO.getInt();
		if ((prvi < 50 || prvi > 200) || (drugi < 50 || drugi > 200)
				|| (treci < 50 || treci > 200)) {
			System.out.println("Broj nije u intervalu od 50-200.");
			return;
		}

		niz = new int[3];
		niz[0] = prvi;
		niz[1] = drugi;
		niz[2] = treci;

		Arrays.sort(niz);

		System.out.println("Sortiran niz glasi: ");
		for (int i = 0; i < niz.length; i++) {

			System.out.println(niz[i]);

		}

		if (drugi != prvi)
			brojac++;
		if (treci != prvi)
			brojac++;
		if (treci != drugi)
			brojac++;
		System.out.println("Razlièitih brojeva u nizu je: " + brojac);

	}

}
