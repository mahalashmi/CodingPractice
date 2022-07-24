class Print1to100{
    public static void main(String[] args)
    {
        Print1to100 p1=new Print1to100();
        p1.print(1,100);
        p1.print(200,205);

       
    }
   public void print(int i,int j)
    {
        while(i<=j)
        {
            System.out.println(i);
            i++;
        }
    }
}