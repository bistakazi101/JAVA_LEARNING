//fileoutput stream

//writing a byte
import java.io.*;
public class Java63_File_outputstream {
//using write byte
	public static void main(String[] args) {
		try {
			
			FileOutputStream fout = new FileOutputStream("/home/saga/Desktop//Fout.txt");
			fout.write(124);
			fout.close();
			System.out.println("success...");    
		}catch(Exception e) {
			System.out.println("The exception is file not found or error");

	}

}
}
