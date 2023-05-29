import java.io.FileReader;

//filereader 
public class java71_Filereader {

	public static void main(String[] args) {
		try {
		FileReader file1 = new FileReader("/home/saga/Desktop//Fout.txt");
		int i =0;
		while((i=file1.read())!=-1) {
			System.out.print((char)i);
		}
		}catch(Exception e) {
			System.out.println("Unhandlled exception handled");
		
		

	}

}
}
