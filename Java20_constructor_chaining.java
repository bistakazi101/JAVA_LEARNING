
//chaining constructor

class Parent{ 
    Parent(){
        this(2);
        System.out.println("This is null constructor");
    }
     Parent(int a){
        this(2,3);
        System.out.println("This is second constructor"+ (a));    
                
    }   
     Parent (int a, int b){
         System.out.println("This is third Constructor"+ (a+b));
    }
}
        
        
//main class      
public class Java20_constructor_chaining {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
    }
}
