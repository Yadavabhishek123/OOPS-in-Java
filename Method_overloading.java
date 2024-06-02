public class Method_overloading {
//    make same name methods with different parameters
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] argus){
        System.out.println(sum(2,3));
        System.out.println(sum(2,3, 4));
        System.out.println(sum(2.0,3.1));
    }
}
