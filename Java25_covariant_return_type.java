
//class A
class A{
   A get(){
        System.out.println("Class A" );
        return this;
    }
}  
//class B
class B{
    @Override
    B get(){
        System.out.println("Class B");
        return this;
    }
}
//covariant return type
public class Java25_covariant_return_type {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.get();
    }
}
