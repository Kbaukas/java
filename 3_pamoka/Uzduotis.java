package trecia_paskaita;

public class Uzduotis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] mass= {5,4,3,2,1};
		int[] mass= {1,2,3,4,3,4,5,7,5,9};
		int dideja=0;
		int mazeja=0;
		int ilgis=mass.length;
		
//		tikrinam cikle ar sekantis elementas mazesnis ar didesnis uz pries tai esanti masyvo elementa.
		for(int i=0;i<ilgis-1;i++) {
			if(mass[i] > mass[i+1]) {
				mazeja++;
			}
			else if(mass[i] < mass[i+1]) {
			dideja++;
			}
		}
//		tikriname kuris is tarpiniu kintamuju yra lygus tikrinimu skaiciui
		 if (dideja==ilgis-1) {
			System.out.println("seka Didejanti");
		 }else if(mazeja==ilgis-1) {
			System.out.println("seka Mazejanti");
			
		 }
		 else System.out.println("nera Seka");
//         isvedame i ekrana masyva atbuline tvarka
		 System.out.println("===========================================");
		 int index=ilgis-1;
		 System.out.println("Atvirciai atvaizduotas masyvas: ");
		 System.out.print("[ ");
		 while(index>=1){
			System.out.print(mass[index]+","+" ");
			index--;
		 }
		 System.out.println(mass[0]+" ]");
		
// tikriname, kuris masyvo elementas turi reiksme 5
		
		 System.out.println("===========================================");
		 System.out.println("Tikriname ar masyvas turi elementa lygu 5: ");
		 int reiksme=5;
		 int kiekElementu=0;
		 for(int i=0;i<ilgis;i++) {
			 if(mass[i]==5) {
				 System.out.println(i+1+" masyvo elemento reiksme lygi "+reiksme);
				 kiekElementu++;
			 }
			
		 }
		 if(kiekElementu==0) {
			 System.out.println("masyvas neturi elementu lygiu " +reiksme);
		 }
//		 kas antro elemento isvedimas i ekrana
		 System.out.println("===========================================");
		 System.out.println("Kas antro masyvo elemento isvedimas i ekrana: ");
		 for(int i=0;i<ilgis;i+=2) {
			 System.out.print(mass[i]+" ");
		 }
	}
}