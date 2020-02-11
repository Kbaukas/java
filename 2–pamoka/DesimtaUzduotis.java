package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class DesimtaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skaicius;
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite sveika skaiciu: ");
		skaicius=input.nextInt();
		input.close();
		for(int i=1;i<=skaicius;i++) {
			System.out.println(i);
		}
	}

}
