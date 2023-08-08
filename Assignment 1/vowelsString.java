import java.util.Scanner;

public class vowelsString {
    public static void main(String args[]) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int length = inputString.length();
        
        System.out.println("Vowels in the string:");
        
        for (int i = 0; i < length; i++) {
            char ch = Character.toLowerCase(inputString.charAt(i)); // Convert character to lowercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }
        }
    }
}
