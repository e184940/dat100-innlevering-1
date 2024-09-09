package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Skriv inn ett tall større enn 0: ");
		int n = scanner.nextInt();
		
		int resultat = 1; 
		
		for (int i = 2; i <= n; i++) {
			
			resultat = resultat*i;

		}
		
		System.out.println(n + "!: " + resultat);
	}

}
