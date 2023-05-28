//java anonymous function
//outer class
class Outer2{
	
	void fun1() {
		System.out.println("This is the parent class");
	}
}
//inner class
class Inner2{
    Outer2 obj1 = new Outer2() {
    	public void fun1() {
    		System.out.println("This is the child class");
    	}
    };
        
	
	}

//main class
public class java50_anonymousFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner2 obj2 = new Inner2();
		//anonymous function calling
		obj2.obj1.fun1();

	}

}
