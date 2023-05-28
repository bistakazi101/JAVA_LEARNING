//method overriding


//parent class     
class vehicle{
   void gears(int gears){
       System.out.println("The vehicle has "+ gears + " gears");
   }
}
// sub class
class Bike extends vehicle{
    void gears(int gears){
        System.out.println("The vehicle has "+ gears + " gears");
    }
}
//main class

public class Java24_overriding {
    public static void main(String[] args) {
        Bike obj1 = new Bike();
        obj1.gears(4);
    }
    
}
