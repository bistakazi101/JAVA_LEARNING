

//Object class of the Java
public class Java35_object_class {
public static void main(String []args) {
	Java35_object_class obj1= new Java35_object_class();
	System.out.println("The object class is the top most class in Java");
	//The file prints the data of the lass name
	System.out.println("The classname of the obj1 is  :"+obj1.getClass());
	//The object return the hash code
	System.out.println("Tthe object return the hash code of the following object class:"+ obj1.hashCode());
	//It returns the string representation of the object
	System.out.println("The object class is the top most class : "+obj1.toString());
}
}
