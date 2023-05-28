
        
//class student     
class  Student{
    int roll;
    String name;
    static String college = "Aryan"; 
    
//    changing the static variable by static method
    static void change(){
        college = "VS";
    }
//    constructor to initialize vaiable
      Student(int r, String n){  
      roll = r;  
      name = n;  
       System.out.println(roll+" "+name+" "+college);
      }          
}

//main method
public class Java15_static_method {

   
    public static void main(String[] args) {
            
    Student.change();//calling change method  
    //creating objects  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Kumar");  
    Student s3 = new Student(333,"Suman");               
    }
}
    

