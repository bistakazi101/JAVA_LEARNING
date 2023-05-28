
//abstract class
abstract class vehicle{
    abstract void function();
    abstract void function2();
}
//abstract subclass
class car extends vehicle{
    @Override
    void function(){
        System.out.println("The abstract class extends subclass");
        }
    void function2(){
        System.out.println("The abstract class extends subclass2");
    }
}
    


//abstract class
public class Java30_abstract_class {
   public static void main(String []args){
            System.out.println("main method"); 
            car obj1 = new car();
            obj1.function();
   }
}
