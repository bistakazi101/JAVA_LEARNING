//file input stream example
import java.io.*;
public class Java65_file_inputStream {
//reading the single character
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try { 
	FileInputStream fin = new FileInputStream("/home/saga/Desktop//Fout.txt");
	int i = fin.read();
	//type conversion
	System.out.println("The First character from the File:"+ (char)i);
}catch(Exception e) {
	System.out.println("The exception is file not found or error");
}
	}

}
