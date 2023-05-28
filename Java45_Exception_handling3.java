//exception Handiling
public class Java45_Exception_handling3 {
//Our Throw exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
		int withdraw = 10000;
		//our throwable
     try {
    	 if(balance<withdraw) {
    		throw new ArithmeticException("Our throwable exception"); 
    	 }
    	 //our catch
     }catch(ArithmeticException e) {
    	 System.out.println("Exception :"+ e.getMessage());
     }
	}

}
