package mainas;
import ArrayBin.*;

public class Mainas {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 50, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 50, 500}
                };
        int[] mass={4,5,6,7,8,2,3,4};

        int valueToFind = 6;

       Find find=new Find();
//binarinis 2d metodas
        System.out.println("------------------2D masyvas (dynamic binFind metodas)----------------------");
        System.out.println();
        System.out.println(find.binFind(matrix,valueToFind));
        System.out.println();
        System.out.println("--------------------Vienmatis masyvas (static binFind metodas)---------------");
      int indexOfMass=Find.binFind(mass,valueToFind);
      System.out.println("ieskomo elemento indeksas = "+indexOfMass);


    }
}
