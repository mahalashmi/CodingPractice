import java.util.Scanner;

public class CreateArray {
    public static void main(String args[]) {
        printAndSum();
        //findIndex();

    }
     public static int printAndSum()
    {   int sum=0;
        int i = 0;
        int[] array;
        array=new int[100];
        while(i<100)
        {
            array[i]=i;
            i++;
        }
        while (i < 100) {
            System.out.println(array[i]);
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        return sum;

    }
    static void findIndex()
    {
        System.out.println("Enter item to find index:");
        Scanner scan=new Scanner(System.in);
        int item=scan.nextInt();
        int[]array=new int[100];
        for(int i=0;i<100;i++)
        {
            if(item==array[i])
            {
                System.out.println(i);
            }
            else {
                System.out.println("exit");
            }
        }


    }

}
