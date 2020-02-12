package trecia_paskaita;

public class UzduotisTrecia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int sum;
		double minus;
		double daugyba;
		double dalyba;
		int liekana;
		

		// Do while loop example
		do {
			System.out.print("Enter a: ");
			a = Integer.valueOf(System.console().readLine());
			System.out.print("Enter b: ");
			b = Integer.valueOf(System.console().readLine());
			sum = a + b;
			minus=(double)a-b;
			daugyba=(double)a*b;
			dalyba=(double)a/b;
			liekana=a%b;
			System.out.println("Sum of a and b: " + sum);
			System.out.println("Minus of a and b: " + minus);
			System.out.println("Multiplication of a and b: " + daugyba);
			System.out.println("Division of a and b: " + dalyba);
			System.out.println("Modulus of a and b: " + liekana);
			System.out.print("Continue? (y/n) ");
		} while ((System.console().readLine()).equals("y"));

	}

}
