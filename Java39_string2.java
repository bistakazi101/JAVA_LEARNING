//string comparable

public class Java39_string2 {
public static void main(String []args) {
	//authentication
	//1)Equal to sign uses
	String obj1 ="Sagar";
	String obj2 ="Sagar";
	//It returns true or false
	System.out.println("The string is used to compare "+ obj1.equals(obj2));
	
	//comparable using refrence variable
	//2)reference variable
	String obj3 = new String(obj1);
	System.out.println("The refrence variable equal to :"+ (obj1=obj2));
	//by using compare to 
	//3)it returns an intger
	String obj4 = "ramhari";
	System.out.println("The first object is greater than second object :"+(obj1.compareTo(obj4)));
}
}
