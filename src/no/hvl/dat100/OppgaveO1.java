package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
				
		int i;
		
		for(i = 1; i <= 10; i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			int poengsum;
			
			System.out.print("Skriv inn poengsum: ");
			poengsum = scanner.nextInt();
		
			if (poengsum < 0 || poengsum > 100) {
				System.out.println("Ugyldig poengsum, må være mellom 0 og 100");
			} else {
				if (poengsum >= 90) {
					System.out.println("Karakter: A");
				} else if (poengsum >= 80) {
					System.out.println("Karakter: B");
				} else if (poengsum >= 60) {
					System.out.println("Karakter: C");
				} else if (poengsum >= 50) {
					System.out.println("Karakter: D");
				} else if (poengsum >= 40) {
					System.out.println("Karakter: E");
				} else {
					System.out.println("Karakter: F");
				}
			}
		}
	}

}
