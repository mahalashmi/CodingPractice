import java.util.*;

class Node{
    int data;
    Node next;
}
class Reverselinkedlistusingiteration
{
    public static  void main(String[] args)
    {
        Node n=new Node();
        n.data=3;
        n.next= new Node();
        n.next.data = 2;
        n.next.next = new Node();
        n.next.next.data = 1;
        n.next.next.next = null;
        print_reverse(n);
    }

    static void print_reverse(Node head)
    {
       Stack<Integer> st;
       st=new Stack<Integer>();

       while(head!=null)
       {
        st.push(head.data);
        head=head.next;
       }
       while(st.empty()==false)
       {
          int result=st.pop();
          System.out.println(result);
       }
    }
}