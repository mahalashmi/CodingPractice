import java.util.*;

public class queuetest
{
    public static void main(String[] args)
    {
        /*
        Queue<Integer> q1;
        q1 = new PriorityQueue<Integer>();
        for(int i=0; i<100; i++)
        {
            q1.add(i);
        }

        
        for(int i=0; i<100; i++)
        {
            int result = q1.remove();
            System.out.println(result);
        }

        Stack<Integer> st;
        st = new Stack<Integer>();
        
        for(int i=0; i<100; i++)
        {
            st.push(i);
        }
        
        while(st.empty() == false)
        {
            int result = st.pop();
            System.out.println(result);
        }
        */
        
        HashMap<Integer, Integer> map;
        map = new HashMap<Integer, Integer>();
        for(int i=0; i<10; i++)
        {
            map.put(i, i*i);
        }

        for(int i=0; i<20; i++)
        {
            if(map.containsKey(i))
            {
                int result = map.get(i);
                System.out.println(result);
            }
        }
    }
}