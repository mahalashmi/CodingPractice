class practice
{
    public static void main(String[] args)
    {
     //printiteration(1,5);
     printrecursion(1,3);
    }
   static void printiteration(int start,int end)
    {
    while(start<=end)
      {
        System.out.println(start);
        start++;
      }
    }
    static void printrecursion(int start,int end)
    {
        if(start>end)
        {
         return ;
        }
        System.out.println(start);
        printrecursion(start+1,end);
    }
}
