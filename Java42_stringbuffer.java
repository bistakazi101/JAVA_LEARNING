//stringbuffer class
//It is Known as a mutable string
public class Java42_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringbuffer class
		StringBuffer obj1 = new StringBuffer("Hellow");
		System.out.println("The append class apend the object "+ obj1.append("World"));
		System.out.println(obj1);
		
		//insert method to given string
		System.out.println(obj1.insert(6," my name is "));
		
		//3)stringbuffer replace method
		System.out.println(obj1.replace(0, 6, "Hi Jack"));
		
		//delete method
		System.out.println(obj1.delete(0, 6));
		
		//7) reverse method
		System.out.println(obj1.reverse());
		//8) buffercapacity
		System.out.println(obj1.capacity());
	}

}
