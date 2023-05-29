import java.io.BufferedReader;
import java.io.FileReader;

//Bufferreader
public class Java75_bufferReader {

	public static void main(String[] args) {
		try {
		FileReader file1 = new FileReader("/home/saga/Desktop//Fout.txt");
		BufferedReader buffer1 = new BufferedReader(file1);
		int i= 0;
		//reading a file
		while((i=buffer1.read())!=-1) {
			System.out.println((char)i);
		}
		buffer1.close();
		file1.close();
		}catch(Exception e) {
			System.out.println("Creating a exception");
		}

	}

}
