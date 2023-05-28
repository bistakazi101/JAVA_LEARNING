

//recursion method using static method

class recursion{
	static void staticMethod() {
		System.out.println("This is a static method");
		//static method calling itself
		staticMethod();
	    	
	}
}


//main class
public class Java36_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the recursion method
       recursion.staticMethod();
	}

}
