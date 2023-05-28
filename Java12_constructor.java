//parameterized constructor


class farmer{
    int id ;
    String name;
//    creating parametrized constructor
            
    farmer(int i , String name1){
        id=i;
        name=name1;
//        displaying name and id
                
        System.out.println("farmer name is " + name +" with id " + id);
    }
                                
    }

//main class


public class Java12_constructor
{
    public static void main(String[] args) {
        farmer obj1 = new farmer(10, "Ram");
        farmer obj2 = new farmer(11, "madan");
    }
            
}
        
        



        
        








        