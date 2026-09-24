public class FibonacciIterative {
    public static void main(String[] args) {
    
        int n1 = 0;
        int n2 = 1;

        System.out.println("Fibonacci Series up to 10 terms:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");

            // Compute the next term
            int n3 = n1 + n2;
           n1 = n2;

            n2 = n3;
       
 }

    }
}
