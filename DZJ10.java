import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class DZJ10 {

    public static void main(String[] args) {
        int[] arr1 = {5,6,7,8};
        int[] arr2 = {3,4,2,1};
        int[] result = minusArr(arr1, arr2);
        System.out.println(Arrays.toString(result));
        
    }

    public static int[] minusArr(int[] arr1, int[] arr2) throws IllegalArgumentException{

        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
    
}
