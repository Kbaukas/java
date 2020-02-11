package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class PenktaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite savaites dienos numeri: ");
		day=input.nextInt();
input.close();
		if(day==1) 
			System.out.println("Pirmadienis");
		else if(day==2) {
			   System.out.println("Antradienis");
		   }
		else if(day==3) {
			   System.out.println("Treciadienis");
		   }
		else if(day==4) {
			   System.out.println("Ketvirtadienis");
		   }
		else if(day==5) {
			   System.out.println("Penktadienis");
		   }
		else if(day==6) {
			   System.out.println("Sestadienis");
		   }
		else if(day==7) {
			   System.out.println("Sekmadienis");
		   }
		else System.out.println("neteisingai ivedete");
		
		}   
}
	
