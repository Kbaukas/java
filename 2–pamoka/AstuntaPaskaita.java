package AntraPaskaita.namu_darbai;

import java.util.Scanner;

public class AstuntaPaskaita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String raide;
		Scanner input=new Scanner(System.in);
		System.out.print("Iveskite raide: ");
		raide=input.next();
		input.close();
		char mazojiRaide=raide.toLowerCase().charAt(0);
		boolean balsis=mazojiRaide =='a'||mazojiRaide =='e'||mazojiRaide =='i'||mazojiRaide =='o'||mazojiRaide =='u';
		if(raide.length()<2 &&( (raide.charAt(0) >= 97 && raide.charAt(0) <= 122) || (raide.charAt(0) >= 65 && raide.charAt(0) <= 90)) ){
           if(balsis) {
        	   System.out.println(raide +" Raide yra balsis!!!");
           }else System.out.println(raide+" Raide yra priebalsis!!!");
		}
		else System.out.println("tai nera raide");
	}

}
