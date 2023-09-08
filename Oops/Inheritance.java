
public class Inheritance {
    public static void main(String args[]) {
         dogs dobby = new dogs();
         dobby.eat();
        // fish f = new fish();
        // f.eat();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class mammals extends Animal 
{
    int legs;

}
class dogs extends mammals 
{
    String breed;   
}
// class fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.print("swim in water");
//     }
// }
