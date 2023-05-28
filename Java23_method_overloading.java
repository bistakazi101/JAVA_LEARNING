
//method overloading

class Overloading{
    //overloading
   Overloading(int a){
       System.out.println("Print first method overloading :" + a);
   }
   //overloading
     Overloading(int a, int b){
       System.out.println("Print second method Overloading:" + (a+b));
   
   }
    
}



//main method
public class Java23_method_overloading {
    public static void main(String[] args) {
        Overloading obj1 = new Overloading(200);
        Overloading obj2 = new Overloading(500,700);

        
    }
}
