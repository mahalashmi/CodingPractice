class SumOfNumbers
{
    public static void main(String[] args)
    {
     // int sum= sum(1,3);
       //System.out.println(sum);
      // int sum=reverse_sum_usingrecursion(1,4);
       //System.out.println(sum);
       //int result=endtostart_using_recursion(1,3);
      // System.out.println(result);
       int iteration_result=endtostart_using_iteration(1,5);
       System.out.println(iteration_result);
    }
    static int sum(int start,int end)
    {
        int result=0;
        for(;start<=end;start++)
        {
         result=result+start;
         
        }
        return result;
    }
    static int reverse_sum_usingrecursion(int start,int end)
    {
        
        if(start>end)
        {
            return 0;
        }
        return start+reverse_sum_usingrecursion(start+1,end);


    }
    static int endtostart_using_recursion(int start,int end)
    {
        if(start>end)
        {
            return 0;
        }
        return end + endtostart_using_recursion(start,end-1);
    }
    static int endtostart_using_iteration(int start,int end)
    {
        int result=0;
        for(;end>=start;end=end-1)
        {
            result=result+end;
        }
        return result;
    
    }

}