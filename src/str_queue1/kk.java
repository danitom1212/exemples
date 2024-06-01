package str_queue1;

import java.util.LinkedList;
import java.util.Queue;

public class kk {

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static <T extends Number> void first(Node<T> chain) {
        Node<Integer> current = (Node<Integer>) chain;
        while (current != null) {
            current.data *= 2;
            current = current.next;
        }
    }

    public static int what (Queue<Integer> q, int x) {
        if (q.isEmpty()|| x != q.peek() )
        return 0;
        x = q.remove();
        return 1 + what(q, x);
    }


    public static int secret(Queue<Integer> q) {
        if (q.isEmpty()) return 0;
        int x = q.peek();
        int z = x * what(q, x);
        int y = 1 + secret(q);
        q.add(z);
        return y;
    }
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<Integer>();
        a.add(7);
        a.add(7);
        a.add(7);
        a.add(7);
        a.add(7);
        a.add(6);
        a.add(4);
        a.add(1);
        a.add(8);
        a.add(4);
        a.add(5);
        // System.out.println(   what(a,7));
        System.out.println(secret(a));

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Original list:");
        printList(node1);
      first(node1);
        printList(node1);
    }


    public static Queue<Integer> arrangeData(Queue<Integer> marks){
        int count=0;
        Queue<Integer> temp = new LinkedList<Integer>();
        Queue<Integer> temp_marks = new LinkedList<Integer>();

        while (!marks.isEmpty())
        {

            if (marks.peek()==-1) {
                temp_marks.add(count);
                marks.remove();
                count=0;
            }
            else{ temp.add(marks.remove());
            System.out.println(1);
            count=count+1;
        }
        }
        while (!temp.isEmpty())
            marks.add(temp.remove());

        return temp_marks;
    }
}