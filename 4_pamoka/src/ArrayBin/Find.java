package ArrayBin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find{
    //    bin find array 1d
    public static int binFind(int[] array, int findVal) {
//        List<Integer> indexes=new ArrayList<Integer>();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index=Arrays.binarySearch(array,findVal);
        return index;
    }
    // bin find matrix
    public List<Integer> binFind(int[][] array,int findVal){
        List<Integer>  indexes=new ArrayList<Integer>();

        for(int[] element:array)
            Arrays.sort(element);
        System.out.println("Isrikiuotas masyvas: ");
        System.out.println(Arrays.deepToString(array));
        for (int[] element:array
        ) {
            indexes.add(Arrays.binarySearch(element,findVal));
        }
        System.out.print("Indeksu masyvas(jei \"-\" vadinasi nerado elemto sioje eiluteje): ");
        return indexes;
    }
    //simple static method 1d array
    public static int find(int[] array, int findVal) {
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == findVal) {
                return i;
            }
        }
        return -1;
    }
    //simple dinamic method 2d array
    public int find(int[][] matrix, int findVal) {
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] == findVal) {
                    return i;
                }
            }
        }
        return -1;
    }


}
