class PrintEndToStart
{
    public static void main(String[] args)
    {
       printendtostart(1,5);
    }
     static void printendtostart(int start,int end)
    {
        while(end>=start)
        {
          System.out.println(end);
          end--;
        }
    }
}