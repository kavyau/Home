import java.util.LinkedList;

public class revDemo {
    class Node
    {
        int data;
        Node next;
    }


    public class reverse(Node current)
    {
        Node prev=null;
        Node next=null;

        while(current!=null)
        {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        LinkedList llist=new LinkedList();
        llist.add(1);
        llist.add(2);
        llist.add(3);

        System.out.println("before reversing"+ llist);
        current=llist.reverse(current);
        System.out.println("after reversing"+ llist);

    }
}
