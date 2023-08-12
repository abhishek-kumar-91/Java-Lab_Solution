

class Circle{
    double circleResult, triangleResult, rectangleResult;
    ;

    public void calculateArea(int radius){
        circleResult =  3.14 * radius * radius;
    }

    public void calculateArea(int l, int b){
        rectangleResult = l * b;
    }

    public void calculateAreaOfTriangle(int breadth, int height) {
       triangleResult =  (double) 1/2 * breadth * height;
    }

    public void displayResult(){
        System.out.println("Using the overload to solve this problem and result show in below: ");
        if(circleResult > 0){
            System.out.println("Area of circle: "+circleResult);
        }else{
            System.out.println("Area of rectangle: "+rectangleResult);
        }
        
        System.out.println("Area of triangle: "+triangleResult);
        
    }

    
}



public class areaOfCIrcle {
    public static void main(String[] args){
        Circle c = new Circle();
        c.calculateArea(5);
       c.calculateAreaOfTriangle(5 , 4);
        c.displayResult();
    }
}
