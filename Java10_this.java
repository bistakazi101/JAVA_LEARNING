 class Student{
        void nameAddition(int a,String name){
           int d = a;
           String  name1 =name;
            System.out.println("my name is "+name1 +" name and My roll number is "+ d);
            
        }
 }
public class Java10_this {
     public static void main(String[] args) {
         Student obj1 = new Student();
         obj1.nameAddition(34, "Ram");
         
     }
}
