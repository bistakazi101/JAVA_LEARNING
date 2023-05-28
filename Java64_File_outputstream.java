//writing into the file output stream
import java.io.*;
public class Java64_File_outputstream {

	public static void main(String[] args) {
		//java output stream
		try {
			FileOutputStream fout = new FileOutputStream("/home/saga/Desktop//Fout.txt");
			String s = "File output stream";
			//converting string into bytes
			byte []b = s.getBytes();
			fout.write(b);
			System.out.println("Writing oof file sucess");
		}catch(Exception e) {
			System.out.println("The exception is file not found or error");
		}

	}

}
