class node{
    int data;
    node next;

}
class Sumlinkedlist
{
    public static void main(String[] args)
    {
       node n=new node();
       n.data=5;
       node n1=new node();
       n1.data=1;
       n.next=n1;
       n1.next=null;
      // int result=recursion_sum(n);
       //System.out.println(result);
       int sumresult=sum(n);
       System.out.println(sumresult);
    }
    static int sum(node head)
    {
        int sum=0;
      while(head!=null)
      {
        sum=sum+head.data;
        head=head.next;
      }
      return sum;
    }
    static int recursion_sum(node head)
    {
        if(head==null)
        {
            return 0;
        }
        return head.data+sum(head.next);
    }
}