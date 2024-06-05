public class Encapsulation {

    // private variables
    private String name ;

    // without constructor this is working so what is the requirement of this constructor
//    public Encapsulation(String name){
//        this.name = name;
//    }


    // theses getter and setter method are useful for accessing and updating these private variables value
    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name){
        this.name = name;
    }

    // Method for Print this value
    public void displayInfo(){
        System.out.println(name);
    }

    public static void main(String[] args){
        // Creating an Instance
        Encapsulation myobj = new Encapsulation();
        myobj.setName("Abhishek Yadav");
        myobj.displayInfo();
        System.out.println(myobj.getName());
    }

}
