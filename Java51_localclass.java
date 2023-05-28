
//local class example
class Outer3{
	void fun() {
		
		//local class
		class local1{
			void fun2() {
				System.out.println("This is a local class");
			}
			
		}
		local1 obj1 = new local1();
		obj1.fun2();
	}
}
public class Java51_localclass {

	public static void main(String[] args) {
		//creating object of outer class
		// TODO Auto-generated method stub
      Outer3 obj2 = new Outer3();
      obj2.fun();
	}

}
