import java.lang.Math;

public class math
{
    public static void main(String args[])
    {
    //    System.out.println(add(4, 5));
    //    System.out.println(mutiply(4,5));
        printpows(0, 10);
    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int mutiply(int a, int b)
    {
        return a*b;
    }

    public static void printpows(int start, int end)
    {
        while(start <= end)
        {
            System.out.println("2 power "+start+ " is "+ Math.pow(2*1.0, start*1.0));
            start++;
        }
    }
}