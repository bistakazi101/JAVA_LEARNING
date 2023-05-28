///This to invoke current class constructor

//parent class
class Parent{
    Parent(){
        System.out.println("Parent constructor");

            }
    Parent(int a){
        this();
                
        System.out.println("child constructor"+ a);
                
                
    }
            
}
        
       
//main class
public class Java19_this_constructor {
    public static void main(String[] args) {
       Parent obj1 = new Parent();
    }
}
