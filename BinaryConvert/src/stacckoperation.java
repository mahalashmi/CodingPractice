import java.util.*;

public class stacckoperation
{
    public static void main(String[] args)
    {
       Stack<Integer> st;
       st=new Stack<Integer>();
       for(int i=0;i<5;i++)
       {
        int result=st.push(i);  
        System.out.println(result);
       }
       int k=st.peek();
       System.out.println(k);
       while(st.empty()==false)
       {
       int res=st.pop();
       System.out.println(res);
       }
       
       

    }
}