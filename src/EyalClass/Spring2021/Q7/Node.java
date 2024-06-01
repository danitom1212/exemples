package EyalClass.Spring2021.Q7;

public class Node<T> {
    public int data;
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<Integer> next) {
        this.next = (Node<T>) next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(int cuont) {

    }
}
