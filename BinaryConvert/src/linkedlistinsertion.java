class Node
{
    int data;
    Node next;

}
class linkedlistinsertion
{
    public static void main(String[] args)
    {
        Node n=new Node();
        n.data=5;

        Node n1=new Node();
        n1.data=7;
        n.next=n1;
        n1.next=null;

        n = insertion(1,n);
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    static Node insertion(int num,Node head)
    {
        Node current=head;
        Node previous=null;
        while((current!=null)&&(current.data<num))
        {
            previous=current;
            current=current.next;
        }

        Node n2=new Node();
        n2.data=num;
        n2.next=current;

        if(previous==null)
        {
            head=n2;
        }
        else      
        {
            previous.next=n2;
        }
        return head;
    }
}
