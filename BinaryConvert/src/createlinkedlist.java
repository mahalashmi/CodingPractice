class Node{
    int data;
    Node next;
}
public class createlinkedlist
{

    public static void main(String args[])
    {
     Node head=create(5);
     while(head.next!=null)
     {
        System.out.println(head.data+"-->"+head.next.data);
    
        head=head.next;

     }
    }

   static  Node create(int n)
    {
        Node previous=null;
        Node head=null;
        while(n>0)
        {
            Node current=new Node();
            current.data=n;
            if(previous==null)
            {
                head=current;
            }
            else 
            {
              previous.next=current;

            }
            previous=current;
            n--;
        }
        return head;
    }
}