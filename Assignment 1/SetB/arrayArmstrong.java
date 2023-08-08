import java.util.*;

public class arrayArmstrong {

    public static int armstrongCheck(int armstrongN){
        int originalNumber = armstrongN;
            int armStrongAns = 0;

            while(armstrongN > 0){
                int digit = armstrongN % 10;
                 armStrongAns += digit * digit * digit;
                armstrongN /= 10;

             } 
             
             return armStrongAns == originalNumber ? originalNumber : 0;
        }
    public static void main(String[] args){
        
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arrAns = new int[n];
        int count = 0;
        
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter armstrong number: ");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            
                if(num == armstrongCheck(num)){
                arrAns[count] = num;
                count++;
            
            }
            
            
        }

        System.out.println("Here is the array list: ");

        for(int i = 0; i < n; i++ ){
            System.out.println(arrAns[i]);
        }
        
            
       
        }
    }

