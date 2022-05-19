import java.io.*;
import java.util.*;
public class BinaryCon
{
    public static void main(String args[])
    {
        BinaryCon.binaryfun(23);
        BinaryCon.binaryfun1(23);
        System.out.println("");
        BinaryCon.binaryfun2(64);
        BinaryCon.binaryfun3(16);
    }

    static void binaryfun(int x)

    {
        while(x>0)
        {
           int rem=x%2;
            System.out. print(rem);
            x=x/2;
        }

        System.out.println("");
    }

    static void binaryfun1(int x)
    {
        if(x==0)
        {
            return;
        }
        binaryfun1(x/2);
        System.out.print(x%2);
    }
    static void binaryfun3(int x)
    {
        if(x==0)
        {
            return;
        }
        System.out.print(x%2);
        binaryfun1(x/2);

    }

    static void binaryfun2(int x)
    {
        Stack<Integer> st=new Stack<Integer>();
        while(x>0)
        {
            st.push(x%2);
            x=x/2;
        }

        while(st.isEmpty()==false)
        {
            System.out.print(st.pop());
        }
        System.out.println("");
    }
}
