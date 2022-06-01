import java.util.Scanner;

class Current
{
    int Data;
    Node Next;
}

public class LinkedList {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of linked list:");
        int size=scan.nextInt();
        int i=0;
       /* while(i<size)
        {
           System.out.println("Enter binary value:");
           int value=scan.nextInt();
        }
        */
       Node previous=null;
        Node head=null;
        Node current;
        current = new Node();

        if (head==null) {
            head=current;

        }


        while (i < size) {

            System.out.println("Enter binary value:");
            current.Data = scan.nextInt();
            current.Next = null;
            System.out.println(current.Data);
            System.out.println(current.Next);
            previous.Next = current;
            previous = current;
            i++;
        }
        }


    }



