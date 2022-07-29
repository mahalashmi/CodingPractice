public class memory
{
    public static void main(String[] input)
    {
        int a = 0;
        fn(a);
        System.out.println(a);

        myclass m1 = new myclass();
        m1.a=0;
        fn1(m1);
        System.out.println(m1.a);
    }

    static void fn(int a)
    {
        a =10;
    }

    static void fn1(myclass m1)
    {
        m1.a = 10;
    }

}

class myclass
{
    public int a;
}