import java.io.FileReader;
import java.io.Reader;

//using filereader
public class Java73_reader {

	public static void main(String[] args) {
		try {
		Reader file1= new FileReader("/home/saga/Desktop//Fout.txt");
		   int i=0;  
           while ((i=file1.read())!= -1) {  
               System.out.print((char)i);  
              
           }  
           file1.close();
		}catch(Exception e) {
			System.out.println("Unhandlled exception handled");
		}
	}

}
