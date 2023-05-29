import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class java67_bufferedOutput {
//buffered output stream
	public static void main(String[] args) {
		try {
	FileOutputStream fout = new FileOutputStream("/home/saga/Desktop//Fout.txt");
	//passing the file Out stream 
	BufferedOutputStream bout = new BufferedOutputStream(fout);
      String s = new String("This is my name sagar");
      byte []b = s.getBytes();
      bout.write(b);
      bout.close();
      fout.close();
      }catch(Exception e) {
    	  System.out.println("The exception is file not found or error");
      }

}
}
