import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


import javax.imageio.stream.FileImageInputStream;

//buffer input stream
public class Java68_buffer_input {

	public static void main(String[] args) {
		try {
		    FileInputStream fin=new FileInputStream("/home/saga/Desktop//Fout.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fin.close();
		
	  }catch(Exception e)
	  {System.out.println(e);}    
	
	}
}

