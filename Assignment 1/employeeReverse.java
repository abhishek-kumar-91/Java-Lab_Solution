import java.util.*;

public class employeeReverse {
    
    public static void main(String[] args){
        System.out.println("Enter the employee name: ");
        Scanner sc = new Scanner(System.in);
        String employeeName = sc.nextLine();
        int length = employeeName.length();
        String revAns = "";

        for(int i = 0; i< length; i++){
            revAns = employeeName.charAt(i) + revAns;
        }
        System.out.println("Before the reverse employee name: "+ employeeName);
        System.out.println("After the reverse employee name: "+ revAns);
    }
}
