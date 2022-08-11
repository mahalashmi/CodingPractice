class Node{
    int data;
    Node next;
}
 class compareorsamelinkedlistusingrecursion
{ 
    public static void main(String[] args)
    {
    Node n1=new Node();
    n1.data=10;
    n1.next=null;
    Node n2=new Node();
    n2.data=2;
    n2.next=null;
    boolean result=comparelinkedlistusingrecursion(n1,n2);
    System.out.println(result);
    }

static boolean comparelinkedlistusingrecursion(Node head1,Node head2)
{
   if((head1==null)&&(head2==null))
   {
    return true;

   }
else
    if((head1==null)||(head2==null))
    {
        return false;
    }
    
    if((head1.data!=head2.data))
    {
      return false;
    }
    return comparelinkedlistusingrecursion(head1.next,head2.next);

   }



}
