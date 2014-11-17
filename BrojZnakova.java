import java.util.Scanner;


public class BrojZnakova {
	public static void main(String[] args) {
		String unos;
		System.out.println("unesi nesto");
		Scanner in = new Scanner(System.in) ;
		unos= in.next() ;
		int brojZnakova = unos.length() ;
		System.out.println("Vas brpj znakova je " + brojZnakova);
	}
}
