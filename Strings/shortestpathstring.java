import java.util.*;
import java.io.*;

public class shortestpathstring {

    public static float shortpath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                x++;
            } else if (s.charAt(i) == 'w') {
                x--;
            } else if (s.charAt(i) == 's') {
                y--;
            } else {
                y++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]) {
        String s = "wneenesennn";
       System.out.print(shortpath(s));

    }
}
