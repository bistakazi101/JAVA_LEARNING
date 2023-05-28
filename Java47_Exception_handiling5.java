//Exception handiling 

//String Exception 
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);	
	 
	}
	
}
public class Java47_Exception_handiling5 {

	public static void main(String []args) {
		
		try {
			vote(10);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		
		
		
       public static void vote( int age) throws InvalidAgeException{
		// TODO Auto-generaage ) {
    	   if (age<18) {
    		   throw new InvalidAgeException("Not eligible Exception1");
    	   }
    	   else {
    		   System.out.println("Eligible for Voting");
    	   }
       }
	}


