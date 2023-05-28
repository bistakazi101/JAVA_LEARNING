//exception handiling 

public class Java43_Exception_handiling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//code for exception
try {
	int data = 100/0;
	
	//our catch exception handiling
}catch(ArithmeticException e) {
	System.out.println("Our catch exception handiling method");	
}
//multiple exception handiling
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(" Our catch ArrayIndexOutException ");
	
}catch(Exception e) {
	System.out.println(" Parent Exception Occurs");
}
	}

}
