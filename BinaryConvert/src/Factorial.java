public class Factorial
{
    public static void main(String[] args)
    {
      //int result=factorial_iteration_endtostart(3);
      //System.out.println(result);
      //int fact_result=starttoend_iteration(3);
      //System.out.println(fact_result);
      //int recursion_Result=fact_iteration_usingrecursion(5);
      //System.out.println(recursion_Result);
      int recursionmethod=starttoend_usingrecursion(1,3);
      System.out.println(recursionmethod);

    }
    static int factorial_iteration_endtostart(int number)
    {
       int fact=1;
       for(;number!=0;number--) 
       {
        fact=fact*number;
       }
       return fact;
    }
    static int starttoend_iteration(int number)
    {
        int fact=1;
        for(int i=1;i<=number;i++)
        {
          fact=fact*i;
        }
        return fact;
    }
    static int fact_iteration_usingrecursion(int number)
    {
    
        if(number==0)
        {
            return 1;
        }
        return number*fact_iteration_usingrecursion(number-1);
    }
    static int starttoend_usingrecursion(int start,int number)
    {
        if(start>number)
        {
            return 1;
        }
       return start*starttoend_usingrecursion(start+1,number);
    }

}