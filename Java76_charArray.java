import java.io.CharArrayReader;

public class Java76_charArray {

	public static void main(String[] args) {
		try {
	char []arra1 = {'J','a','v','a'};
	//charArrayReader
	CharArrayReader file1 = new CharArrayReader(arra1);
	int a= 0;
	while((a=file1.read())!= -1) {
		System.out.print((char)a);
	}
		}catch(Exception e) {
		System.out.println("Printing the exception");
	}
	}

}
