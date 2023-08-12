

class PowerNumber{
   int x, y;
   
   

   public int powerNumberPrint(int x, int y){
        if (y == 0) {
            return 1; // Anything raised to the power of 0 is 1
        } else {
            return x * powerNumberPrint(x, y - 1);
        }
   }
}




public class recursionPowerNumber{
    public static void main(String[] args){

        PowerNumber p = new PowerNumber();
        int result;
        result = p.powerNumberPrint(5, 2);
        System.out.println("Power number: "+result);
    }
}