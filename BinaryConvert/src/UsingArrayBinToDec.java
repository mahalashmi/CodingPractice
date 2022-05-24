import java.util.Scanner;

public class UsingArrayBinToDec {
    public static void main(String args[]) {
        int [] array;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scan.nextInt();
        array=new int[size];
        System.out.println("Enter binary value:");
        for(int index=0;index<size;index++)
        {
            array[index]=scan.nextInt();
        }

        int y=array.length-1,base=1,result=0,rem=0;
        while(y>=0)
        {
            rem=array[y]*base;
            result=result+rem;
            base=base*2;
            y--;
        }

        System.out.println(result);


    }
}


