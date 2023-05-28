//exception handiling 
public class Java44_Exception_handiling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		      try {    
		  
		        System.out.println("Inside the try block");  
		          
		        //below code throws divide by zero exception  
		       int data=25/0;    
		       System.out.println(data);    
		      }    
		      //cannot handle Arithmetic type exception  
		      //can only accept Null Pointer type exception  
		      catch(NullPointerException e){  
		        System.out.println(e);  
		      }   
		  
		      //executes regardless of exception occured or not   
		     finally {
		    	 System.out.println("Finally Block is executed");
		     }
	}

}
