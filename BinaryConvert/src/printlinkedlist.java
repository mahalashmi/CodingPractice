class Node{
    int data;
    Node next;

}
class printlinkedlist
{
    public static void main(String[] args)
    {
        Node n=new Node();
        n.data = 20;

        Node next = new Node();
        next.data = 30;

        n.next = next;
        next.next=null;
       // printmethod(n);
        //int find_k=find_kth_element(n,3);
        //System.out.println(find_k);
        int find_x=find_x_in_linkedlist(n,30);
        System.out.println(find_x);

    }
    static  void printmethod(Node head)
    {
     while(head!=null)
     {
        System.out.println(head.data);
        head=head.next;
     }
    }
    static int find_kth_element(Node head,int k)
    {
         int length=0;

        while(head!=null)
        {
            length=length+1;
            if(k==length)
            {
                return head.data;
            }
            head=head.next;

        }
        return 0;
    }
    static int find_x_in_linkedlist(Node head,int x)
    {
        int position=0;
        while(head!=null)
        {
            position++;
            if(x==head.data)
            {
                return position;
            }
            head=head.next;
        }
        return 0;
    }
    
}