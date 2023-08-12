import java.util.*;

class ObjectPass{
    String name, address,position;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter address: ");
        this.address = sc.nextLine();
        System.out.print("Enter position: ");
        this.position = sc.nextLine();
        sc.close();
    }
    public void obPass(ObjectPass ob){
        this.name = ob.name;
        this.address = ob.address;
        this.position =ob.position;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Position: "+position);
    
    }

}




public class copyObject {
    public static void main(String[] args){
        ObjectPass o = new ObjectPass();
        o.input();
        o.display();
        
        ObjectPass a = new ObjectPass();
        a.obPass(o);
        a.display();
    }
}
