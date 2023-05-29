import java.io.FileWriter;
import java.io.Writer;

//creating the file writer
public class Java72_filewriter {

	public static void main(String[] args) {
 //using writer
		try {
			Writer file1 = new FileWriter("/home/saga/Desktop//Fout.txt");
			file1.write("I am writing to this file");
			file1.close();
		}catch(Exception e) {
			System.out.println("Unhandlled exception handled");
		}

	}

}
