import java.util.*;

class Student{
   private int rollno, mark1, mark2;
   private String sName;
    

    public void inputUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No: ");
        this.rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        this.sName = sc.nextLine();
        System.out.print("Enter Student Mark1: ");
        this.mark1 = sc.nextInt();
        System.out.print("Enter Student Mark2: ");
        this.mark2 = sc.nextInt();
        sc.nextLine();
        
    }

    class Result{
       private int finalResult;
        private double percentageResult;

            public void totalMark(){
                    finalResult = mark1 + mark2;
                    percentageResult = (double)finalResult/200 * 100;
            }
            public void displayResult(){
                System.out.println("-----------------------------------");
                System.out.println("Student Roll No: "+rollno);
                System.out.println("Student Name: "+sName);
                System.out.println("Student Mark1: "+mark1);
                System.out.println("Student Mark2: "+mark2);
                System.out.println("Student Total Marks: "+finalResult);
                System.out.println("Student Final Percentage: "+percentageResult);
            }
    }
}

public class innerClass{
    public static void main(String[] args){
        Student s = new Student();
        s.inputUser();
        Student.Result sr = s.new Result();
        sr.totalMark();
        sr.displayResult();
    }
}