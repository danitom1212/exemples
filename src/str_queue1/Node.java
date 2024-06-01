package str_queue1;

public class Node<T> {

    public int data;
    public Node<T> next;

    public Node(T data) {
        this.data = (int) data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(T data) {
        this.data = (int) data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int size() {
        int count = 0;
        Node<T> current = this;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}





