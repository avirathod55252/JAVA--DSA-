
public class Statickeyword {
    public static void main (String args[])
    {
        Student s1 = new Student();
        s1.Collegename="dyp";
        Student s2 = new Student();
        System.out.println(s2.Collegename);
        
    }
}
class Student 
{
    String name;
    int age;
    static String Collegename;

}
