
public class methodoverloadin {

    public static void main(String args[]) {
        calculator c = new calculator();
        System.out.print(c.sum(3, 3));
        System.out.print(c.sum((float) 1.5, (float) 2.5));
    }

}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

}