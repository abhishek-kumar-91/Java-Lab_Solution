class fibo{

    int n;
    int [] result;

    fibo(int n){
        this.n = n;
        result = new int[n];
    }

    void fiboFunction(){
        for(int i = 0; i < n; i++){
            if(i == 0 || i == 1){
                result[i] = i;
            }else{
                result[i] = result[i - 1] + result[i - 2];
            }
        }
    }
  

    public void displayFibo(){
        for(int i = 0; i < n; i++){
            System.out.println("Fibonacci series: "+result[i]);
        }
    }
}





public class fibonacci {
    public static void main(String[] args){
        fibo f = new fibo(100);
        f.fiboFunction();
        f.displayFibo();
    }
}
