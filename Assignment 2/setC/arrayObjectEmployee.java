import java.util.*;

class Employee{
    private String employeeName;
    static int n = 1;

    Employee(){
       System.out.println(" Using Static Method to count empolyee number : "+ n++);
    }
    public void inputUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();
    }

    public  void display(){
        System.out.println("------------------------------------------");
        System.out.println("Employee Name: "+employeeName);
    }
    public String getEmployeeName() {
        return employeeName;
    }
}




public class arrayObjectEmployee {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter employe n number: ");
        int n = s.nextInt();

        Employee e[] = new Employee[n];

        for(int i = 0; i < n; i++){
            e[i] = new Employee();
            e[i].inputUser();
        }

        
        Arrays.sort(e, Comparator.comparing(Employee::getEmployeeName));
        for(int i = 0; i < n; i++){
           
            e[i].display();
        }
    }
}
