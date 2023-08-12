class FactorialCalculator {
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int number = 5; 
        FactorialCalculator calculator = new FactorialCalculator();
        int factorial = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
