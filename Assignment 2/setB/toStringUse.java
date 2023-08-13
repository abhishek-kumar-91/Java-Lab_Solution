class Student{
    int rollNo,per;
    String sName;

    Student(int rollNo, String sName , int per){
        this.rollNo = rollNo;
        this.sName = sName;
        this.per = per;
    }

    public void display(){
        System.out.println("Student Roll Number: "+rollNo);
        System.out.println("Student Name: "+sName);
        System.out.println("Student Percentage: "+per);
    }
}





public class toStringUse {
    public static void main(String [] args){
        Student s = new Student(1, "Abhishek", 87);
        s.display();
       
        s.toString();
        s.display();
       
    }
}
