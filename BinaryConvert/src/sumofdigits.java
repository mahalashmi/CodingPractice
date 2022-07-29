public class sumofdigits
{
    public static void main(String[] args)
    {
       //int result=sum(423);
       //System.out.println(result);
       int recursion_result=sum_using_recursion(236);
       System.out.println(recursion_result);
       
    }
    static  int sum(int number)
    {
        int result=0;
        while(number!=0)
        {
           int sum=number%10;
         result=result+sum;
            number=number/10;

        }
     return result;
    }
   
    static int sum_using_recursion(int number)
    {
        if(number==0)
        {
            return 0;
        }
        return number%10+sum_using_recursion(number/10);
    }
}