package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class SestaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pirmasNr;
		double antrasNr;
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite pirma skaiciu: ");
		pirmasNr =input.nextDouble();
		System.out.print("Iveskite antra skaiciu: ");
		antrasNr=input.nextDouble();
		input.close();
		double skirtumas=Math.abs(pirmasNr-antrasNr);
		if(skirtumas<0.01) {
			System.out.println("Skaiciai yra vienodi");
		}
		else System.out.println("Skaiciai skirtingi");
	}

}
