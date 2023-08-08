public class arrayEvenNo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java EvenNumbersFromArray <number1> <number2> ...");
            return;
        }

        System.out.println("Even numbers from the array:");
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
