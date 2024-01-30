class Animal {
  String color = "white";
}

class Dog extends Animal {
  String color = "black";

  void printcolor() {
    System.out.println(color);
  }

}

class superkey {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.printcolor();

  }
}