class Arraysum
{
    public static void main(String[] args)
    {
     int[]array=new int[5];
     array[0]=1;
     array[1]=1;
     array[2]=8;
     array[3]=0;
    // int result=sum(array);
     //System.out.println(result);
     int recursion_result=sum_using_recursion(array,0);
     System.out.println(recursion_result);
    }
    static int sum(int[]array)
    {
        int sum=0,i=0;
        while(i<=array.length-1)
        {
            sum=sum+array[i];
            i++;
        }
        return sum;
    }
    static int sum_using_recursion(int[]array,int i)
    {
        if(i>array.length-1)
        {
            return 0;
        }
        return array[i]+sum_using_recursion(array,i+1);
        
    }
}