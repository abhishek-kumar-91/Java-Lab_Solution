public class binaryPattern9 {
    public static void main(String args[]){
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int ans = i + j;
                if(ans % 2 == 0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
