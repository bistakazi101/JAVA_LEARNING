import java.io.FileWriter;

//writing file writer class
public class Java70_FileWriter {

	public static void main(String[] args) {
		try {
			//creating the file writer object
		FileWriter file1 = new FileWriter("/home/saga/Desktop//Fout.txt");
		//writing inti file
		file1.write("Hellow using Filewriter");
		//closing the file
		file1.close();
		}catch(Exception e) {
			System.out.println("Unhandlled exception handled");
		}
	}

}
