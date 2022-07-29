public class PrintArray
{
    public static void main(String[] args)
    {
       int[] array = new int[4];
       array[0]=2;
       array[1]=7;
       array[2]=9;
       array[3]=6;
       //print(array);
       //int result=findindex(array,3);
       //System.out.println(result);
       int findresult=findelement_in_array(array,6);
       System.out.println(findresult);
      // print_using_recursion(array,0);
      //print_array_reverse_recursion(array,3);

    }

    static void print(int[] array)
    {
        if(array == null)
        {
            return;
        }

        int length = array.length;
        for(int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }
    }
    static int findindex(int[] array,int k)
    {
        if(k>0)
        {
            return-1;
        }
        int index=0;
        int length=array.length-1;
        
        while(index<=length)
        {
           if(index==k)
           {
            return array[index-1] ;
            
           }
           index++;
        
        }
        return -1;
    }
    static int findelement_in_array(int[] array,int x)
    {
        int index=0;
        int length=array.length-1;
        while(index<=length)
        {
            if(array[index]==x)
            {
                return index;
            }
            index++;
        }
        return -1;
    }
    static void print_using_recursion(int[] array,int index)
    {
        int j=array.length-1;
        if(index>j)
        {
            return;
        }
        System.out.println(array[index]);
        print_using_recursion(array,index+1);

    }
    static void print_array_reverse_recursion(int[]array,int j)
    {
       // int index=0;
        if(j<0)
        {
            return;
        }
        System.out.println(array[j]);
        print_array_reverse_recursion(array,j-1);

    }
    static int findelement_in_array_usingrecursion(int[] array,int index,int k)
    {
        if(index)
    }
}