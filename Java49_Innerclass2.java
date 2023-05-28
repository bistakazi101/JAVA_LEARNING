

//java innerclass without static method

class Outer1{
	int a =100;
	class Inner1{
     void fun1() {
    	 System.out.println("The outer function variable is :"+ a);
     }
	}
}

public class Java49_Innerclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //we always have to make outer refrence variable
		Outer1 obj1 = new Outer1();
		//creating the outer function
		Outer1.Inner1 obj2 = obj1.new Inner1();
		obj2.fun1();
	}

}
