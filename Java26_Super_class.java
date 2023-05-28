class color1{
    String color="Blue";
    
}
class color2 extends color1{
    String color2 = "Black";
    void fun(){
          System.out.println("The function name is :" + super.color);
    }
}


//super refers to parent class instance variable
public class Java26_Super_class {
    public static void main(String[] args) {
        color2 obj1 = new color2();
        obj1.fun();
                
    }
    
}
