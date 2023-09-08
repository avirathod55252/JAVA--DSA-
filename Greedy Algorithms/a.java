import java.util.*;

 class a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];
        int bc= sc.nextInt();
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if (b[i]==bc)
            {
                break;
            }
           System.out.println(b[i]);
           
        }
        

    }
}
