import java.util.Scanner;

public class SumOfArray {
    public static void main(String args[]) {
        // sum();
        find();
    }


    public static int sum() {
        int[] array = new int[100];
        int i = 0;
        int sum = 0;
        while (i < 100) {
            array[i] = i;
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);
        return sum;
    }

    public static void find() {
        int[] array = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number from 0 to 100:");
        int item = scan.nextInt();
        int i = 0,j=1;
        while (i < 100) {
            array[i] = j;
            if (item == array[i]) {
                System.out.println(i);
            }
j++;
            i++;
        }


    }
}



