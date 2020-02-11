package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class DevintaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int metai;
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite metus: ");
		metai=input.nextInt();
		input.close();
		if(metai%4==0 ||(metai%400==0 && metai%100!=0)) {
			System.out.println(metai+" yra keliamieji metai.");
		}
		else 
			System.out.println( metai+" nera keliamieji metai.");
	}

}
