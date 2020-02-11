package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class PirmaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input number: ");
//		int x=Int.valueOf(System.console().readLine());
		int x=input.nextInt();
      if(x>0) {
    	  System.out.println("Number is positive");
      }
      else System.out.println("Number is negative");
    	  input.close();
	}

}
