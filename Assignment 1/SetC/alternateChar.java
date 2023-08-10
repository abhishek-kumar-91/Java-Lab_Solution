import java.util.Scanner;

public class alternateChar {
    public static void main(String args[]){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name =  sc.next();

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i++));
        }

    }
}
