//thread class
class A1 extends Thread{
	//run method have to be override
	public void run() {
		for(int a=0;a<=10;a++) {
			System.out.println("running1 :"+ a);
		}
	}
	
}
class B1 extends Thread{
	//run method have to be override
	public void run() {
		for(int a=0;a<=10;a++) {
			System.out.println("running2 :"+ a);
		}
	}
}
public class Java55_Threadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
     //overriding run method
     B1 obj1 = new B1();
     obj1.start();
     A1 obj2 = new A1();
     obj2.start();
	}catch(Exception e) {
		System.out.println("e");
	}

	}
}
