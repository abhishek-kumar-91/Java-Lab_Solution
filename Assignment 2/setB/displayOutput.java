import java.util.*;


class Person{
    private String name, address, course;
    private int mobileNo;
    static int n = 1;
    
    Person(int n){
        System.out.println("Person: "+ n++);
    }
   
    Person(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Address: ");
        this.address = sc.nextLine();
        System.out.print("Enter Course Name: ");
        this.course = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        this.mobileNo = sc.nextInt();
        sc.nextLine();
        
    }

    public void display(){
        // System.out.println("Person: "+ n);
        System.out.println("---------------------"+ n++ +"-------------------------\n");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Course: "+course);
        System.out.println("Mobile No: "+mobileNo);
    }
}

public class displayOutput {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        
        p1.display();
        p2.display();
        p3.display(); 
        p4.display();
        p5.display();
        
        
        
    }
}
