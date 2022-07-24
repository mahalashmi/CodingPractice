public class TestFunction
{    
    public static void main(String[] input)
    {
       /*  int j=input.length-1;
        System.out.println(j);
        while(j>=0)
       {
            System.out.println(input[j]);
            j--;
      }*/
      Test.staticmethod();
     // Test.print();
      Test t1 = new Test();
      System.out.println(t1.incr());
      t1.print();

      Test t2 = new Test();
      t2.print();
    }
}

class Test
{
    int a=10;
    static int b= 50;

    static void staticmethod()
    {    

      System.out.println("Magi");
    }

    void nonstaticmethod()
    {
        System.out.println("suriya");
    }

    int incr()
    {
        a= a+10;
        return a;
    }

    int decr()
    {
        b = b-20;
        return b;
    }

    static void print()
    {
        System.out.println(b);
    }
}