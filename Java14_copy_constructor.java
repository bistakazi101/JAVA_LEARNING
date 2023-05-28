

//Student class
//creating a copy constructor


class Student{
        int id;
        String name;

     Student(int i, String n) {
         id= i;
         name= n;
         System.out.println("My name is " + name + " and my roll no is "+ id);
    }
//passing object1 

     Student(Student S) {
         id = S.id;
         name= S.name;
         System.out.println("My name is " + name + " and my roll no is "+ id);
                 
    }
        
}
   
//main class
public class Java14_copy_constructor {
    public static void main(String[] args) {
        Student obj1= new Student(10, "Kaustub");
               Student obj2 = new Student(obj1);

    }
    
}
