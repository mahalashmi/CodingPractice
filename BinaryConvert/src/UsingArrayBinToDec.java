import java.util.Scanner;

public class UsingArrayBinToDec {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int array[]=new int[num];
        int x=0,base=1,result=0;
        while(array.length>=0)
        {
int rem=array[num]*base;
if(rem==1)
{
    result=result+base;
}
num--;
base=base*2;

        }
        System.out.println(result);

    }
}
