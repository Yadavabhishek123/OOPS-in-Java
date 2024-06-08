interface Shape1{
    // abstract method
    double area();
    void display();
}

// Implimentation the shape 2 interface in this class
class Circle implements Shape1 {
    double radius;

    // Constructor creation
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.println("Area");
        return Math.PI*radius*radius;
    }

    @Override
    public void display(){
        System.out.println("This is a Circle");
    }
}


public class Interface_Program {


    public static void main(String[] args){
        // Creating an Instance
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        circle.display();
    }

}
