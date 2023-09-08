
public class getandset {
    // get to return value
    // set : modify the value
    public static void main(String args[]) {
        Pen p = new Pen();
        p.setcolor("blue");
       System.out.println(p.getcolor());
    }

}

class Pen {
    private  String Color;
    private  String tip;

    String getcolor() {     // getter 
        return this.Color;
    }

    void setcolor(String newcolor) {  // setter 
        this.Color = newcolor;
    }
}
