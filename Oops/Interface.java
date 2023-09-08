
public class Interface {
    
    public static void main (String args[])
    {
        rook r = new rook();
        r.moves();
    }
}
interface chessplayer 
{
    void moves ();
}
class queen implements chessplayer 
{
    public void moves()
    {
        System.out.println("up, down,left,right, diagonal "); 
    }
}
class rook implements chessplayer 
{
    public void moves()
    {
        System.out.println("up, down,left,right,"); 
    }
}
