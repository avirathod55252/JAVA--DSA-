
public class EvenorOdd {
    public static void checkevenorodd(int n)
    {
      int bitmask = 1;
      if ((n&bitmask)==0)
      {
        // even nummber 
        System.out.print("even number");
      }
      else{
        System.out.print("Odd number");
      }


    }
    public static void main (String args[])
    {
        int n = 6;
        checkevenorodd(n);
    }
}
