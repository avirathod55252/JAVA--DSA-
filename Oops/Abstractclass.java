
public class Abstractclass {

    public static void main(String args[]) {

        Mustang m = new Mustang();

        // horse h = new horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // chiken c = new chiken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    Animal() {
        System.out.println("animal constructors is called ");
    }

    abstract void walk();
}

class horse extends Animal {
    void walk() {
        System.out.println("walk 4 legs");
    }

     horse() {
        System.out.println(" horse constructor is called ");
    }
}

class Mustang extends horse {
    Mustang() {
        System.out.println("Mustang Constructor is called");
    }
}

class chiken extends Animal {
    void walk() {
        System.out.println("walk 2 legs ");
    }
}
