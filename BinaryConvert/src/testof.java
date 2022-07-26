class testof{
    public static void main(String[] args)
    {
        hiiter();
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

    public static void hi()
    {
            System.out.println(10);
            hi();
    }

    

    public static void hiiter()
    {
        ushort i=0;
        while(true)
        {
            System.out.println(i);
            i++;
        }
    }
}