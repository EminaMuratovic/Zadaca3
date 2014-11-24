public class IgricaPogodiBroj {
	public static void main(String[] args) {
		int broj, c, brojac = 0;
		System.out.println("Pogodite broj koji je racunar zamislio!");
		c = (int) (1 + Math.random() * 100);
		do {

			System.out.println("Upisite broj: ");
			broj = TextIO.getInt();
			if (broj == -1)
				return;
			if (broj < 1 || broj > 100)
				System.out.println("Broj nije u intervalu od 1-100.");
			if (broj < c)
				System.out.println("Zamisljeni broj je veci!");
			else if (broj > c)
				System.out.println("Zamisljeni broj je manji!");
			brojac++;
		} while (broj != c);
		System.out.println("Cestitamo! Zamisljeni broj je bio " + broj
				+ " ! Broj pokusaja: " + brojac);

	}
}
