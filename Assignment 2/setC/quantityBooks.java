import java.util.*;

class Books{
    private String bookName;
    static int count;
    int n = 1;
    Books(){
       System.out.println("Book No: "+n++);
       count++;
    }

    public void inputUser(){
        Scanner sc = new Scanner(System.in);
        this.bookName = sc.nextLine();
    }

    public void display(){
        System.out.println("--------------------------------------------------");
        System.out.println("Books Name: "+bookName);
    }
    public static void totalBooks(){
        System.out.println("Total Books Count: "+ count);
    }

}

public class quantityBooks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n book size:  ");
        int n = s.nextInt();

        Books b[] = new Books[n];

        for(int i = 0; i < n; i++){
            b[i]= new Books();
            b[i].inputUser();
        }

        for(int i = 0; i < n; i++){
            b[i].display();
           
        }

        Books.totalBooks();

        


    }
}
