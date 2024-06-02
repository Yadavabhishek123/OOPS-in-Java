class Animal{
    void makesound(){
        System.out.println("Make Sound");
    }
}

class Lion extends Animal{

    @Override
    void makesound(){
        System.out.println("Roar.......");
    }
}

class Tigar extends Animal{
    void makesound(){
        System.out.println("Some Sound........");
    }
}


public class Method_override {
    // means we have a super class and a sub class and both have a same name method
    public static void main(String[] args){
        Animal myobj = new Lion();
        Animal obj1 = new Tigar();

        myobj.makesound();
        obj1.makesound();
    }
}
