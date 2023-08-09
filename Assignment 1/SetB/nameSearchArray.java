import java.util.*;

public class nameSearchArray {
    public static void main(String[] args){
        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] name = new String[n];
        String ansStore = "";
        int count = 0;
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter the name: ");
            Scanner s = new Scanner(System.in);
            String nameA = s.nextLine();
            name[i] = nameA;
        }

        System.out.println("Array list: ");

        for(int i =0; i<n; i++){
            System.out.println(name[i]);
        }

        System.out.println("If you want to search name then you select 1 or 0 for quite: ");
        Scanner t = new Scanner(System.in);

        int search = t.nextInt();
        
        if(search == 1){
            System.out.println("Enter the name for search: ");
                Scanner ans = new Scanner(System.in);
                String searchAns = ans.nextLine();
                String userInput = searchAns;
                boolean found = false;

            for(int i = 0; i < n; i++){
                
                
                if(name[i].equals(userInput)){
			ansStore = name[i];
                    found = true;
                    break;
                }
                    
            }

            if(found){
                System.out.println(ansStore +" Found");
            }else{
                System.out.println("Not found");
            }
        }else{
            System.out.println("Thank you!!!!");
        }
        

        
    }
}
