package trecia_paskaita;

public class UzduotisAntra {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 2, 3, 4, 5},
				{10, 20, 30, 40, 50},
				{100, 200, 300, 400, 500}};
//		
		int eiluciuSuma[]=new int[3];
		int stulpeliuSuma[]=new int[5];
		
//		skaiciuojame eiluteje esanciu elementu suma
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				eiluciuSuma[i]+=matrix[i][j];
				
			}
			
			System.out.println("Eilutes "+(i+1)+" suma: "+eiluciuSuma[i]);
		 }
//		skaiciuojame kiekviename stulpelyje esanciu elementu suma
		int ilgisEilutes=matrix[0].length;
		int stulpelioIlgis=matrix.length;
		
		for(int i=0;i<ilgisEilutes;i++) {
			for(int j=0;j<stulpelioIlgis;j++) {
				stulpeliuSuma[i]+=matrix[j][i];
//				
			}
			
			System.out.println("Stulpelio "+(i+1)+" suma: "+stulpeliuSuma[i]);
		 }
//		(„eilutės“ indeksą, „stulpelio“ indeksą).
		int tikrinamaReiksme=300;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==tikrinamaReiksme) {
					System.out.println("masyvo elementas kuris lygus: "+tikrinamaReiksme+" yra "+(i+1)+" eiluteje ir "+(j+1)+" stulpelyje ");
				}
				
			}
		
		}
	}
}
