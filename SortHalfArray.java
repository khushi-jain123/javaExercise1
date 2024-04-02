import java.util.Arrays;
import java.util.Collections;

public class SortHalfArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 7, 6}; 
        sortHalfArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void sortHalfArray(int[] array) {
        int mid = array.length / 2;

        
        Arrays.sort(array, 0, mid);
         
        Integer[] secondHalf = new Integer[mid];
        for (int i = mid; i < array.length; i++) {
            secondHalf[i - mid] = array[i];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());
        for (int i = mid; i < array.length; i++) {
            array[i] = secondHalf[i - mid];
        }
    }
}