import java.util.*;

class Product{
    int pid, price;
    static int totalAmount;
    String pname;

    public void inputUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.print("Enter product id: ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        pname = sc.nextLine();
        System.out.print("Enter product price: ");
        price = sc.nextInt();
        totalAmount += price;
        sc.nextLine();
    }


    public void displayProduct(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Product ID: "+pid);
        System.out.println("Product Name: "+pname);
        System.out.println("Product Price: "+price);
        
    }
    public static void totalCalc(){
        System.out.println("Total Amount: "+totalAmount);
    }



   
}



public class productDetails{
    public static void main(String[] args){
        System.out.println("5 product details and total amount");
        Product p[] = new Product[5];

        for(int i = 0; i < 5; i++){
            p[i] = new Product();
            p[i].inputUser();
            
        }

        for(int i = 0; i < 5; i++){
            p[i].displayProduct();
            p[i].totalCalc();
        }

        
    }
}