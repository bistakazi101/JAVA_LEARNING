import java.io.FileInputStream;

//reading multiple line from the stream
public class java66_File_inputstream {

	public static void main(String[] args) {
		try {
			
			FileInputStream fin = new FileInputStream("/home/saga/Desktop//Fout.txt");
		    int i=0;    
            while((i=fin.read())!=-1){    
				System.out.print("Reading from the file :"+((char)i));
			}
			fin.close();
		}catch(Exception e) {
			System.out.println("The exception is file not found or error");
			
		}

	}

}
