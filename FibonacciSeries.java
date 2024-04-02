public class FibonacciSeries {
    public static void main(String[] args) {
        int numberOfTerms = 10; 
        generateFibonacciSeries(numberOfTerms);
    }

    public static void generateFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series up to " + numberOfTerms + " terms:");
        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}