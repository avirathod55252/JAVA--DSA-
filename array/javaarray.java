import java.util.Scanner;

public class javaarray {
  public static int add(int a, int b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String args[]) {
    // int arr[] = new int[3];

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number:");
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // int arr2[] = { 1, 2, 3, 4, 5 };
    // for (int i = 0; i < arr2.length; i++) {
    // System.out.println(arr2[i]);
    // }
    // System.out.print("enter the rank which want:");

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();

    // switch (a) {
    // case 1:
    // System.out.print("1St rank ");
    // case 2:
    // System.out.print("2nd rank ");
    // break;
    // case 3:
    // System.out.print("3rd rank");
    // break;
    // default:
    // System.out.print("not a rank other students ");

    // }

    // add(3, 3, 3);
    // System.out.println(add(1, 2));
    // System.out.println(add(3, 3, 3));
    // System.out.println(adder.add(3, 8));
    // System.out.println(adder.add(3.3, 4.4));
    // bike b = new bike();
    // b.run();
    String s = "avinash ";
    // String s = "avinash rathod ";

    String s2 = new String("avinash"); // creating string new keyword

    char[] ch = { 'a', 'b', 'c', 'd' };

    String str = new String(ch);
    System.out.println(s);
    System.out.println(s2);

    System.out.println(str);
  }

}
// method overloading:

class adder {
  public static int add(int a, int b) {
    return a + b;
  }

  public static double add(double a, double b) {
    return a + b;
  }
}

// method overriding :
class vehicle {
  void run() {
    System.out.println("vehicle running : ");
  }

}

class bike extends vehicle {
  void run() {
    System.out.println(" Hero honda bike run ::");
  }
}
