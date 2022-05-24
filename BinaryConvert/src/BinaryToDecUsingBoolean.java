import java.util.Scanner;

public class BinaryToDecUsingBoolean {
    public static void main(String args[])
    {
        boolean [] array;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size= scan.nextInt();
        array= new boolean[size];
        System.out.println("Enter true or false:");
        for(int i=0;i<size;i++)
        {
            array[i]= scan.nextBoolean();
        }
        int y=array.length-1,rem=0,base=1,result=0,true1=1,false0=0;
        while (y>=0)
        {
          if(array[y]==true)
          {
              rem=true1*base;

          }else {
              rem=false0*base;
          }
          if(rem!=0)
          {
              result=result+base;

          }
          base=base*2;
          y--;

        }
        System.out.println(result);



    }
}

