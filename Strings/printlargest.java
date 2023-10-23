public class printlargest {
    public static void main (String args[])
    {
        // String  fruit []= { "apple","mango","banana"};
        // String largest = fruit[0];
        // for (int i=1;i<fruit.length;i++)
        // {
        //     if (largest.compareTo(fruit[i])<0)
        //     {
        //         largest = fruit[i];

        //     }
        // }
        // System.out.print(largest);
        String fruit []= { "apple", "mango","banandddda"};
        String largest = fruit[0];
        for (int i=0;i<fruit.length;i++)
        {
            if (largest.compareTo(fruit[i])<0)
            {
                largest = fruit[i];
            }
        }
        System.out.print(largest);
    }
}
