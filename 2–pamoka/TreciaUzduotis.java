package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class TreciaUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
Scanner input=new Scanner(System.in);
System.out.print("Iveskite pima skaiciu: ");
a=input.nextInt();
System.out.print("Iveskite antra skaiciu: ");
b=input.nextInt();
System.out.print("Iveskite trecia skaiciu: ");
c=input.nextInt();
input.close();
if(a>b && a>c) {
	System.out.println("didziausias yra: "+a);
}
if(b>a && b>c) {
	System.out.println("didziausias yra: "+b);
	
}
if (c>a && c>b) {
	System.out.println("didziausias yra: "+c);
}
	}

}
