import java.util.*;
class Node{
    int data;
    Node next;
}
public class printreverselinkedlistusingstack
{
    public static void main(String[] args)
    {
    Node n=new Node();
    n.data=3;
    
    Node n1=new Node();
    n.next=n1;
    n1.data=5;
    n1.next=null;
    print(n);
    }

    static void print(Node head)
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