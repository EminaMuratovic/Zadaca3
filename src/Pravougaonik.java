
public class Pravougaonik {
	public static void main(String[] args) {
		int duzina, sirina;
		do{
		System.out.println("Unesite sirinu pravouganika: ");
		sirina=TextIO.getInt();
		System.out.println("Unesite duzina pravouganika: ");
		duzina=TextIO.getInt();
		} while(duzina<0 || sirina<0);
		System.out.print("+");
		for(int i=0; i<duzina-2; i++)
			System.out.print("-");
		System.out.print("+");
		System.out.println();
		for(int i=0; i<sirina; i++)
		{
			System.out.print("|");
			for(int j=0; j<duzina-2; j++)
				System.out.print(" ");
			System.out.print("|");
			System.out.println();
		}
		System.out.print("+");
		for(int i=0; i<duzina-2; i++)
			System.out.print("-");
		System.out.print("+");
	}

}
