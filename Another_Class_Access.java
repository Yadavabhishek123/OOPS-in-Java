public class Another_Class_Access {

    public static void main(String[] args){
        // Create an instance to Access public variable and pubic method
        // Always create this instance by Actual class name like here ---  Public_Access_Modifiers
        Public_Access_Modifiers obj2 = new Public_Access_Modifiers();
        obj2.public_method();


        // Create an instance like before to access private class i am not able to do that

        // Create an instance like before to access protected class i am not able to do that ib simple way but if i am
        // extend this class and make a derived class then this is work
    }

}
