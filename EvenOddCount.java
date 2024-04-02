public class EvenOddCount {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 9, 10, 12, 15}; 
        countEvenOdd(array);
    }

    public static void countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }
}