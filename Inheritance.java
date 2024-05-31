// super class/ parent class
class Parent_class{
    void method1(){
        System.out.println("This is a parent class method 1");
    }

    void method2(){
        System.out.println("This is a parent class method 2");
    }
}

// subclass / child class
// for making inherited class we use extend keyword
class Child extends Parent_class{
    // This class is Inherited so that this uses
    // all the properties of parent class like method1, nethod2

    void m_child1(){
        System.out.println("This is a child class method 1");
    }

}
public class Inheritance {

    public static void main(String[] argu){
        // create an instance or object from parent class
        Parent_class myobj  = new Parent_class(); // this objecrt is only able to access parent class method
        myobj.method1();
        myobj.method2();
        Child myobj1 = new Child(); // this is able to access both parent and child class method
        myobj1.m_child1();
        myobj1.method1();
        myobj1.method2();
    }
}
