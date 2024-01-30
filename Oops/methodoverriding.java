
public class methodoverriding {

    public static void main(String args[]) {

        deer d = new deer();
        Animal a = new Animal();
        a.eat();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats something");
    }

}

class deer extends Animal {
    void eat() {
        System.out.println("eats graps");
    }
}
