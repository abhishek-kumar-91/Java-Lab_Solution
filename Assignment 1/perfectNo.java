public class perfectNo {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int n = 1000; // You can change the value of n as needed
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
