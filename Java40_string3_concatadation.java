
//using string concatadation
public class Java40_string3_concatadation {
public static void main(String []args) {
	//By + operator
	String a= "Hellow";
	String b = "World";
	String c = a+b;
  System.out.println(c)	;
  
  
  //2) using concat method
    String d = a.concat(b);
    System.out.println(d);
    
    //substring in java
    //3) using substring method
    System.out.println("Using the substring method in java: "+(a.substring(0,2)));
    
    
}
}
