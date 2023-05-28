
class Student{
    int id;
    String name;
    
     Student(int id, String name) 
    {
     this.id = id;
     this.name = name;        
    }          
     
     void display(){
                 System.out.println("The roll no "+ id + "and name is name is " + name);

     }
             
}

public class Java17_this_current_instance {

    public static void main(String[] args) {
      
    Student obj1 = new Student(20,"ram");
    obj1.display();
            
    }
    
}
