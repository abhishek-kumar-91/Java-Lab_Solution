import java.util.*;

public class cityNames{
    public static void main(String[] args){
        System.out.println("Enter the total city number that you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] city = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the city name: ");
            Scanner st = new Scanner(System.in);
            String name = st.nextLine();
            city[i] = name;
        }

        Arrays.sort(city); //for sort in ascending order

        for(int i = 0; i < n; i++){
            System.out.println("City Name: "+city[i]);
        }
    }
}

