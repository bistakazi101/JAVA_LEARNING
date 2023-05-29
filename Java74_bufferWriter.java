import java.io.BufferedWriter;
import java.io.FileWriter;

//bufferWriter
public class Java74_bufferWriter {

	public static void main(String[] args) {
		//creating a buffer writer
		try {
			//creating a file writer
		FileWriter file1 = new FileWriter("/home/saga/Desktop//Fout.txt");
		//creating a buffer writer
		BufferedWriter bfout = new BufferedWriter(file1);
        bfout.write("Creating a buffer Writer");
        System.out.println("Sucess");
		}catch(Exception e) {
			//creating a exception
			System.out.println("Unhandlled exception handled");
		}
	}

}
