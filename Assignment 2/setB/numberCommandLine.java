class MyNumber{
    private int n;
    MyNumber(){
        this.n = 0;
    }

    MyNumber(int n){
        this.n = n;
    }

    public boolean isNegative(){
        return n < 0;
    }
    public boolean isPositive(){
        return n > 0;
    }
}




public class numberCommandLine {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("No value provided: ");
            return;
        }
       

        int inputUser = Integer.parseInt(args[0]);
         MyNumber nu = new MyNumber(inputUser);

         System.out.println("Value: " + inputUser);
        System.out.println("Is Negative? " + nu.isNegative());
        System.out.println("Is Positive? " + nu.isPositive());
    }
}
