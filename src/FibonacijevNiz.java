
public class FibonacijevNiz {
	public static void main(String[] args) {
		int niz[], n, i;
		System.out.println("Unesite broj mjesta trazenog broja: ");
		n=TextIO.getInt();
		if(n<=0 || n>50) System.out.println("Broj nije u intervalu (0,50");
		niz=new int[50];
		niz[0]=niz[1]=1;
		for(i=2; i<n; i++)
			niz[i]=niz[i-1]+niz[i-2];
		System.out.println(niz[i-1]);
	}

}
