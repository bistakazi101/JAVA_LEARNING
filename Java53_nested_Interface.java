//java nested Interface
interface i1{
	//nested interface
	interface i2{
		void show();
	}
}
public class Java53_nested_Interface implements i1.i2{
	public void show() {
	System.out.println("This is the Java nested interface");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Java53_nested_Interface obj1 = new Java53_nested_Interface();
         obj1.show();
		
	}
}
