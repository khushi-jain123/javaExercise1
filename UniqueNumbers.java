import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 8, 4, 9, 10, 6}; 
        printUniqueNumbers(array);
    }

    public static void printUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        for (int num : array) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }
          System.out.println("Unique numbers in the array:");
        for (int uniqueNum : uniqueNumbers) {
            System.out.print(uniqueNum + " ");
        }
    }
}