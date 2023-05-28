
//inheritance concept
//parent class
class Animal{
    void eat(){
    System.out.println("Animal is to Eating");
}
}
//child class
class Dog extends Animal{
 void bark(){
     System.out.println("Dog is to barking");
 }
 
}
//child class
class Wolf extends Animal{
    void howl(){
    System.out.println("Wolf is to Howling");
}
}

//main class
public class Java21_inheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.bark();
        Wolf obj2 = new Wolf();
        obj2.howl();
    }
}
