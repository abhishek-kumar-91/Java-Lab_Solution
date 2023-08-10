import java.util.Scanner;

public class reverseString {
    
    public static void main(String args[]){
        int n = 5;
        String [] store = new String[n];
        String dig = " ";

        for(int i = 0; i < n; i++){
            System.out.println("Enter the name: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String st = name;
            for(int j = 0; j < st.length(); j++){
                 dig = st.charAt(j) + dig;
                
            }
            store[i] = dig;
            dig = "";
        }

        System.out.println("String array list print each character in reverse order: \n ");
        
        for(int i = 0 ; i < n; i++){
            System.out.println(store[i]);
        }

       
    }
}
