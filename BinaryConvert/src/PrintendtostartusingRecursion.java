class PrintendtostartusingRecursion
{
    public static void main(String[] args)
    {
printusingrecursion(1,5);
    }
    static void printusingrecursion(int start,int end)
    {
        if(start>end)
        {
            return;
        }
        printusingrecursion(start+1,end);
        System.out.println(start);
    }
}