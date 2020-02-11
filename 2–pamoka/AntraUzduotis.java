package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class AntraUzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double determinantas ;
		  double pirmaSaknis= 0;
		  double antraSaknis = 0;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Iveskite a: ");
	      double a = input.nextDouble();

	      System.out.print("Iveskite b: ");
	      double b = input.nextDouble();

	      System.out.print("Iveskite c: ");
	      double c = input.nextDouble();

	      determinantas = (b*b)-(4*a*c);
	      double saknis = Math.sqrt(determinantas);

	      if(determinantas>0){
	         pirmaSaknis = (-b + saknis)/(2*a);
	         antraSaknis = (-b - saknis)/(2*a);
	         System.out.println("Pirma saknis: "+ pirmaSaknis +" Antra saknis: "+antraSaknis);
	      }else if(determinantas == 0){
	         System.out.println("Saknis yra "+(-b + saknis)/(2*a));
	      }
	      else System.out.println("Nera saknies");
	}

}
