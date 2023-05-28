

//aggregation example in Java
class Student{
    int roll ;
    int class1;
    Address address;
}
//aggregation 
        
class Address{
    String city;
    int postcode;
}
        

public class Java22_aggregation {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        //address is treated as a variable
        obj1.address.city = "Kathmandu";
        obj2.address.postcode = 200;
        System.out.println("");
    }
}
