import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {3, 6, 8, 9, 10};

        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

      
        for (int num : array1) {
            
			set1.add(num);
        }

    
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Common elements between the two arrays:");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }
}