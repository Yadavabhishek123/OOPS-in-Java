public class Class_Method {
    // Creating class method
    // function that are created inside a class are called class methods
    // example

    static int return_keyword(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public int subtract(int a, int b){ // public method without static keyword
        return a-b;
    }

    static void mymethod(int age, String name){ // name of this method is mymethod
        // write logic here
        System.out.println("Hello java I am Abhishek yadav my age is " + age);
    }
    // parameters are  any variable that we are adding inside parenthesis are called parameters
    // here age and name are parameters


    public static void main(String[] argu){ // this is a public static main method

        mymethod(21, "Abhishek Yadav");
        int a = 2;
        int b = 20;
        int sum = return_keyword(a, b);
        System.out.println(sum);

        // calling a static method here

        // here we not access this static method, so we access by class name
        int res = Class_Method.multiply(a, b);
        System.out.println(res);

        // calling a public method
        // we can access this ethod by creating a object, see below
        Class_Method myobj = new Class_Method();
        int ans = myobj.subtract(a, b);
        System.out.println(ans);
    }
}
