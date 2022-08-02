import java.util.*;

class queueoperation
{
    public static void main(String[] args)
    {
      
      Queue<Integer> q1;
        q1 = new PriorityQueue<Integer>();
      add(q1);
      //q1.add();
      //q1.peek();
      //q1.size();
      //q1.remove();
    //   for(int i=1;i<10;i++)
    //     {
    //         q1.add(i);
    //     }
        
            int result=q1.peek();
            System.out.println("First element in queue is:");
            System.out.println(result);
        
            System.out.println("Length of the queue is:");

            int result1=q1.size();
            System.out.println(result1);
            
                for(int i=1;i<10;i++)
        {
           int queueitems= q1.remove();
           System.out.println(queueitems);

        }
    }
   
    static void add(Queue<Integer> q1)
    {
        for(int i=1;i<10;i++)
        {
            q1.add(i);
        }
    }

    /*
    static void peek()
    {
       
            int result=q1.peek();
            System.out.println(result);
        
    }
    static void size()
    {
        for(int i=1;i<10;i++)
        {
            int result1=q1.size();
            System.oot.println(result1);
        }
    }
    static void remove()
    {
        for(int i=0;i<10;i++)
        {
           int queueitems= q1.remove();
           System.out.println(queueitems);

        }
    }*/
}