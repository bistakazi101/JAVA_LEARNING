//Java inner class
//inner class with static variable

    class Outer{
	int a =10;
	
	//inner class
	public static class Inner{
		void f1() {
			int a= 10;
		System.out.println("The outer clas variable is " + a);
	}
}
    }
public class java48_Innerclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the inner variable
		Outer obj1 = new Outer();
		Outer.Inner  obj2 = new Outer.Inner();
		obj2.f1();
		
	}

}
