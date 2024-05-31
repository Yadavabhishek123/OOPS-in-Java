public class Consturctor_Java {

    //constructor is a special method that is called when instantiating or creating a new object

    String name ;
    int age;
    // default constructor
//    public Consturctor_Java(){
//        name = "Abhishek Yadav";
//        age = 21;
//    }

    void show(){
        System.out.println("My name is: " + name + "and my age is :" + age);
    }

    // parametrized constructor
    public Consturctor_Java(String a, int b){
        name = a;
        age = b;
    }
    public static void main(String[] argu){
        Consturctor_Java myobj = new Consturctor_Java("Abhishek Yadav ", 21); // for calling parametrized constructor give parameter in this class name
        myobj.show();
    }
}
