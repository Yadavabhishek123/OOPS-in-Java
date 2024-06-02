interface Sports{
    void play();
}

class Cricket implements Sports{

    @Override   // this keyword shows that there is a method that is intendid to override method declared into super class
    public void play(){
        System.out.println("Playing Cricket");
    }
}

class Football implements Sports{
    @Override   // this keyword shows that there is a method that is intendid to override method declared into super class
    public void play(){
        System.out.println("Playing Football");
    }
}

public class Poly_With_Interface {

    public static void main( String[] args) {
        Cricket myobj = new Cricket();
        Sports myobj1 = new Football();

        myobj.play();
        myobj1.play();
    }
}


