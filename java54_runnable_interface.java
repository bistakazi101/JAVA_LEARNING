//runnable interface

class Runable1 implements Runnable{
	public void run() {
		for(int a=0;a<=10;a++) {
			System.out.println("Runing1 :"+ a);
			
		}
	}
}

class Runable2 implements Runnable{
	public void run() {
		for(int a=0; a<=10;a++) {
			System.out.println("Running2 :"+ a);
		}
	}
}
public class java54_runnable_interface {
//main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj1 = new Thread(new Runable1());
		Thread obj2 = new Thread(new Runable2());
	    obj1.start();
	    obj2.start();
 
	}
}
