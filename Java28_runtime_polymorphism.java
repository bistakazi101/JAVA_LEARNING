
   class Bike{  
  void run(){
      System.out.println("Parent class of Bike");
  }  
}  
class Bike1 extends Bike{ 
  void run(){
      System.out.println("Hero honda");
  }  
}
//Java runtime polymorphism

public class Java28_runtime_polymorphism {
    public static void main(String[] args) {
        Bike b = new Bike1();//upcasting  
        b.run();  
        
    }
    
}
 

