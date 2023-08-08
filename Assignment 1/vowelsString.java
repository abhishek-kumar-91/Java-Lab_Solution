import java.util.*;


public class vowelsString {
    
    public static void main(String args[]){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String vowel = sc.nextLine();
        int length = vowel.length();
        String ans = "";
        for(int i = 0; i < length; i++){
            System.out.println(vowel.charAt(i));
            

        }
    }
}
