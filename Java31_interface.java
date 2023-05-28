//java interface 
//interface initialization
interface interface1{
    //default final static int 
    int a= 10;
    int b = 10;
    //method is abstract and static
    int function(int c, int d);
}

//subclass implements interface
class class1 implements interface1{
  
   public int function(int c, int d){
       //returning interface
     return (a*b*c*d);
    }
    
}
//main class
public class Java31_interface {
    public static void main(String []args){
        class1 obj1= new class1();
        obj1.function(10, 10);
      
    }
}
