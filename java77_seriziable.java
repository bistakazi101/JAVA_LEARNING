//serilizable
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student10{
	Student10(int a, String name){
		System.out.println("Print "+ a + "and "+ name);
	}

	
}
public class java77_seriziable implements Serializable{

	public static void main(String[] args) {
	try {
		//creating a object
		  Student10 s1 =new Student10(211,"ravi");    
		FileOutputStream file1 = new FileOutputStream("/home/saga/Desktop//Fout.txt");
		ObjectOutputStream out = new ObjectOutputStream(file1);
		out.writeObject(s1);
		out.flush();
		out.close();
		
		
	}catch(Exception e) {
	System.out.println("Unhandlled exception handled");

	}

}
}
