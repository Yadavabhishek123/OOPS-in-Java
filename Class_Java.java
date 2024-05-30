public class Class_Java{

    int x = 5;
    String s = "Abhishek Yadab";
    public static void main(String[]argu){
        // creating a object using new keyword
        // syntax is :- ClassName obj_name = ClassName()

        Class_Java myobj = new Class_Java(); // myobj is a object
        Class_Method obj = new Class_Method(); // i can create object into this calss by another class
        // and also use the method of another class like multiply
        int mul = Class_Method.multiply(5, 6);
        System.out.println(mul);

        // Invoking this object
        System.out.println(myobj.x); // vakue of this is 5, this line access x
    }
}