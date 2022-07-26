class PrintReverseUsingRecursion
{
    public static void main(String[] args)
    {
       printreverse(1,5);
    }
    static void printreverse(int start,int end)
    {
      if(start>end)
      {
        return;
      }
      printreverse(start+1,end);
      System.out.println(start);
    }
}