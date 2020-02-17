import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TobulasSkaicius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dalyba;
        int skaicius = 10000;
        int tarpinis = 0;
        int sum = 0;
        int result;
        int[] mass = new int[6];
        int k=0;
        for (int i = 1; i <= skaicius; i++) {

            sum = 0;
            for (int j = 1; j < skaicius; j++) {
                dalyba = i % j;

                if (dalyba == 0) {
                      if (j < i) {
                        sum += j;
                    }
                }
            }
            if (i == sum) {
                mass[k]=i;
                k++;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}