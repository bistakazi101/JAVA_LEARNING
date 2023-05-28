

//using java string methods
public class Java41_string4_methods {

	
	//using the string meythods in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1)To uppercase and lowercase
		String obj1 = "hellow";
		String obj2 ="WORLD";
		System.out.println("changing to uppercase :"+ obj1.toUpperCase());
		System.out.println("changing to lowercase:"+ obj2.toLowerCase());
		
		//2)Trim method
		String obj4= "   Trim method  ";
		System.out.println("The trim methods replace the value of the space"+(obj4.trim()));
		
		//3)stratswith and endswith
		System.out.println("The object starts with "+ obj1.startsWith("he"));
		System.out.println("The object starts with "+ obj1.endsWith("w"));
		
		//4) String charAt
		System.out.println("The object character starts with "+ obj1.charAt(2));
		//5) String length
		System.out.println("The length of the object "+ obj1.length());
		
		//6)replace method
		System.out.println("replace all occurance of hellow to Hi"+ obj1.replace("hellow","hi"));
		
	}

}
