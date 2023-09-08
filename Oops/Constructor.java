public class Constructor {
    public static void main(String args[]) {
        Student avi = new Student();;
        // System.out.println(avi.name);
    }
}

class Student {
    String name;
    int roll;

    // Student(String name) {
    //     this.name = name;
    // }
    Student ()
    {
        System.out.println("constructors is called ");
    }
}