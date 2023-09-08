
public class oops {

    public static void main(String args[]) {
        Pen p = new Pen();
        p.setcolor("white ");
        System.out.println(p.color);  
        p.settip(5);  
        System.out.println(p.tip);

        bankaccount sb = new bankaccount();
        sb.username="avinash";
        // sb.password="2222"; it is not accesable to directly 
        sb.setpassword("avinash");
        

    }
}

class Pen {
    String color;
    int  tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int  newtip) {
        tip = newtip;
    }
}

class student {
    String name;
    int age;
    float percentage;

    void calculatepercentage(int phy, int che, int bio) {
        percentage = (phy + che + bio) / 3;

    }
}
class bankaccount {
    public String username ;
    private String password;

    public void setpassword (String pwd)
    {
        password=pwd;
    }

}