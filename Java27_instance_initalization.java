
//instance initalization block

//class A
class A{
    {
        System.out.println("The system instance initialization block" );
    }
    //constructor called
    A(){
        System.out.println("Constructor invoked");
    }
}

//main class
public class Java27_instance_initalization {
    public static void main(String[] args) {
        A obj1 = new A();
    }
}
