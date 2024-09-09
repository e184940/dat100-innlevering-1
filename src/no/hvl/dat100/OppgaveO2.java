package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Skriv inn bruttoinntekt: ");
		int inntekt = scanner.nextInt();

		double t1 = 0.017;
		double t2 = 0.04;
		double t3 = 0.136;
		double t4 = 0.166;
		double t5 = 0.176;

		if (inntekt <= 208050) {
			System.out.println("Du betaler ingen ekstra trinnskatt");
		} else if (inntekt >= 208051 && inntekt <= 292850) {
			System.out.println("Din inntekt er: " + inntekt + ", du betaler: " + (inntekt * t1)
					+ "kr i skatt, din nettoinntekt er da: " + (inntekt - (inntekt * t1)) + "kr");
		} else if (inntekt >= 292851 && inntekt <= 670000) {
			System.out.println("Din inntekt er: " + inntekt + ", du betaler: " + (inntekt * t2)
					+ "kr i skatt, din nettoinntekt er da: " + (inntekt - (inntekt * t2)) + "kr");
		} else if (inntekt >= 670001 && inntekt <= 937900) {
			System.out.println("Din inntekt er: " + inntekt + ", du betaler: " + (inntekt * t3)
					+ "kr i skatt, din nettoinntekt er da: " + (inntekt - (inntekt * t3)) + "kr");
		} else if (inntekt >= 937901 && inntekt <= 1350000) {
			System.out.println("Din inntekt er: " + inntekt + ", du betaler: " + (inntekt * t4)
					+ "kr i skatt, din nettoinntekt er da: " + (inntekt - (inntekt * t4)) + "kr");
		} else if (inntekt >= 1350001) {
			System.out.println("Din inntekt er: " + inntekt + ", du betaler: " + (inntekt * t5)
					+ "kr i skatt, din nettoinntekt er da: " + (inntekt - (inntekt * t5)) + "kr");
		}

	}

}
