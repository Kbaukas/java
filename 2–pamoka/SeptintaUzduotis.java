package AntraPaskaita.namu_darbai;

import java.time.YearMonth;
import java.util.Scanner;

public class SeptintaUzduotis {

	public static void main(String[] args) {
		
		
		int menesis;
		int metai;
		String menesioPav[]= {"Sausis","Vasaris","Kovas","Balandis","Geguze","Birzelis","Liepa","Rugpjutis","Rugsejis","Spalis","Lapkritis","Gruodis"};
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite menesi: ");
		menesis=input.nextInt();
		if(menesis>12 ||menesis<1||(menesis>12 &&menesis<1)) {
			System.out.println("Neteisingai ivedete menesi");
			System.out.print("Dar karta iveskite menesi: ");
			menesis=input.nextInt();
		}
		System.out.print("Iveskite metus: ");
		metai=input.nextInt();
		int dienuSk;
		
		input.close();
		YearMonth menesioDuomenys = YearMonth.of(metai, menesis);
		dienuSk=menesioDuomenys.lengthOfMonth();
//		System.out.println(menesioPav[menesis]);
		System.out.println(menesioPav[menesis-1]+" "+metai+" metais turi "+ dienuSk +" d.");
//		
	}
	

}
