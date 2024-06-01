package exQus;

import java.util.Queue;

public class difrent {
public static Node difrentNode(Node head) {

    if (head == null || head.next == null) return null;
    Node difhead = null;
    Node difTil = null;
    Node current = head;
    while (current.next != null) {
        int diff = Math.abs(current.data - current.next.data);
        Node newNode = new Node((diff));
        if (difhead == null) {
            difhead = newNode;
            difTil = newNode;
        } else {
            difTil.next = newNode;
            difTil = newNode;
        }
     current=current.next;
    }
    return difhead;
}
public static int difOfNodes(Node head){
    while (head!=null&&head.next!=null) {
        Node chine = difrentNode(head);
        head = chine;
    }
    if (head!=null){
        return head.data;
    }
    else return -1;
}

    public static void printChine (Node head){
        Node currect=head;
        while (currect!=null){
            System.out.println(currect.data);
            currect=currect.next;
        }

    }
}
