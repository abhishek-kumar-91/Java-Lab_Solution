import java.util.*;

public class perfectNo {
    

    public static void main(String[] args){
        System.out.println("Enter the n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ans = new int[400];
        int jValue = 0;
        int ansPerfect = 0;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < 9; j++){
                if(i % j == 0 && j != i){
                    jValue += j;
                    // if(i == jValue){
                    //     ansPerfect = i;
                    // }else{
                    //     jValue=0;
                    // }
                }

                
            }
            
        }

        System.out.println("Perfect number list: ");
        // for(int i = 0; i < ans.length; i++ ){
        //     System.out.println("Perfect Number is: "+ i);
        // }
        System.out.println(ansPerfect);
        System.out.println(jValue);
    }
}
