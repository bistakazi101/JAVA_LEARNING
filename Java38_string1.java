//creating example of string1
class string1{
	//creating the array method
	void array1() {
	char []arra1 = {'a','b','c','d','e'}; 
	
	//using for each loop
	for(char name: arra1) {
		System.out.println("The character printed one by one is "+ name);
	}
	}
}
public class Java38_string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the string1 class
		string1 obj1 =new string1();
		obj1.array1();

	}
}



