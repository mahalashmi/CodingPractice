import java.util.*;

class hashmap{
    public static void main(String[] args)
    {
       // HashMap<Integer, Integer> h1;
        //h1=new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> h1;
        h1 = new HashMap<Integer, Integer>();
        for(int i=0;i<5;i++)
        {
            h1.put(i,i+5);
        }
        for(int i=0;i<5;i++)
        {
            if(h1.containsKey(i))
            {
                int result=h1.get(i);
                System.out.println(result);
            }
        }
    }
}