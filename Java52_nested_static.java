//nested static class

//Outer class
class  Outer4{
	
	//static class
	static class Inner4{
		void fun1(){
			System.out.println("This is a nested static  class");
		}
	}
}
//main class
public class Java52_nested_static {
//static class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer4.Inner4 obj1 = new Outer4.Inner4();
       obj1.fun1();
	}

}
