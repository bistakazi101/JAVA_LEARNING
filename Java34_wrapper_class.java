//java wrapper class
public class Java34_wrapper_class {
public static void main(String []args) {
	int i=10;
	//autoboxing
	Integer j = new Integer(i);//wrapping or autoboxing
	System.out.println("The process of changing the value integer value into "
			+ "object is called auto boxing");
	
	//unboxing
	int a= j.intValue();
	//assigining the object into int type
	System.out.println("The value of a is :"+a);
}
}
