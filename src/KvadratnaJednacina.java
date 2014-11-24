
public class KvadratnaJednacina {
	public static void main(String[] args) {
		int a, b, c, y, x;

			System.out.println("Unesite koeficijente a, b i c: ");	
			a=TextIO.getInt();
		b=TextIO.getInt();
		c=TextIO.getInt();
		if ((a<-10 || a>10) || (b<-10 || b>10) || (c<-10 || c>10))
			System.out.println("Koeficienti a, b, c nisu u zadanom intervalu.");
		else
			System.out.println("Unesite tacku x: ");
			x=TextIO.getInt();
			y=a*x*x+b*x+c;
			System.out.println("f(" + x +")=" + y); 
		
	}

}
