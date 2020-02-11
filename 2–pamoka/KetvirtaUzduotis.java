package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class KetvirtaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x;
		Scanner input=new Scanner(System.in);
		System.out.print("Input value: ");
		x=input.nextFloat();
		input.close();
		if(x==0) {
			System.out.println("zero");
		}
		if(x>0) {
			
			if(x<1) {
				System.out.println("positive, small");
			}
			else if(x>1000000) {
				System.out.println("positive, large");
			}
			else System.out.println("positive value");
		}
		if(x<0) {
			if(Math.abs(x)<1) {
				System.out.println("negative, small");
			}
			else if(Math.abs(x)>1000000) {
				System.out.println("negative, large");
			}
			else System.out.println("negative value");
		}
	}

}
