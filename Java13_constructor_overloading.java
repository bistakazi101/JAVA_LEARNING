
//creating a class 
class Student{
    int roll;
    String name;
    String classname;
    
//    parametrized constructor
            
    Student( String b , String c,int a){
        roll=a;
        name=b;
        classname=c;
        System.out.println(name + " class name is "+ classname
                
                + "and his roll no is "+roll);     
    }
//    parametrized constructor
            
            
    Student( String name1, int a){
         name= name1;
         roll=a;
        System.out.println(name + " has a roll no of "+ roll);
    }
}
//main class
public class Java13_constructor_overloading {

    
    public static void main(String[] args) {
//        creating objecct of parametrized constructor
                
       Student obj1 = new Student("Ten","Ram", 13);
              Student obj2 = new Student("Ram",14);

               
    }
    
}
