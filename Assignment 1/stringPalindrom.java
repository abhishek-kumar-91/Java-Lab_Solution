import java.util.*;

public class stringPalindrom {
    public static void main(String[] args){
        System.out.println("Enter the string to check palindrom: ");
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int lenString = p.length();
        String revAns = "";

        char ch;

        for(int i = 0; i < lenString; i++){
           ch = p.charAt(i);
           revAns = ch+revAns;
        }
        System.out.println("Entered word: "+ p);
         if(p.equals(revAns)){
            System.out.println("String is palindrom ");
         }else{
            System.out.println("String is not palindrom ");
         }


    }
}
