import java.util.Scanner;

public class xxzz {
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = str.nextLine();
        int l = s.length();
        int [] cnt = new int[256];

        for(int i = 0; i < l; i++){
            cnt[(int) s.charAt(i)]++;

        }

        for(int i = 0; i < l; i++){
            if(cnt[i] !=0){
                System.out.println((char) cnt[i] + " = " + cnt[i]);
            }
        }
    }
}
