

//Hellow class


class Hellow{
    void function1(){
        System.out.println("This is function1");
                       
    }
//    calling the parent function
    void functioncall(){
//        this refers to object         
        this.function1();
                
    }
    
}
        
        
//main method
        
public class Java18_this_method {
    public static void main(String[] args) {
         Hellow obj1 = new Hellow();
    obj1.function1(); 
    }
  
}
