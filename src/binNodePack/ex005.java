package binNodePack;

import str_queue1.Node;

import java.lang.reflect.Array;

public class ex005 {
    public static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setValue(T value) {
            this.value = value;
        }


        public void setNext(str_queue1.Node<T> chain) {

        }
    }


    public static void buildFreqList(Node<Integer> chain) {
        Node<Integer> current = chain;
        Node<Integer> newChain = new Node<>(current.getValue());
        Node<Integer> newChainCurrent = newChain;
int[] temp=new int[2];
        while (current != null) {
            int value = current.getValue();
            int count = 1;
            while (current.getNext() != null && current.getNext().getValue() == value) {
                if (current.getNext().getValue() == value ){

                    count++;
               current.getNext();
                }
                count++;
                current = current.getNext();
                if (temp[1]<count){
                    temp[0]=current.getValue();
                    temp[1]=count;
                }
            }
            newChainCurrent.setNext(new Node<>(count));
            newChainCurrent = newChainCurrent.getNext();

            if (current.getNext() == null) {
                break;
            }

            current = current.getNext();
            newChainCurrent.setNext(new Node<>(current.getValue()));
            newChainCurrent = newChainCurrent.getNext();
        }

        chain.setValue(newChain.getValue());
        chain.setNext(newChain.getNext());
        System.out.println(temp[0]+" D "+temp[1]);
    }
    public static void first(str_queue1.Node<Integer> chain){
        if (chain.next==null)return;
        Node<Integer> current = new Node<>(chain.data);
      current.setNext(chain);

        first(chain);

    }

    public static void main(String[] args) {
        // Create a sample linked list: 100 -> 40 -> 20 -> 100 -> 100 -> 20 -> 30 -> 20 -> 20
        Node<Integer> node9 = new Node<>(20);
        Node<Integer> node8 = new Node<>(30);
        node8.setNext(node9);
        Node<Integer> node7 = new Node<>(1);
        node7.setNext(node8);
        Node<Integer> node6 = new Node<>(20);
        node6.setNext(node7);
        Node<Integer> node5 = new Node<>(10);
        node5.setNext(node6);
        Node<Integer> node4 = new Node<>(20);
        node4.setNext(node5);
        Node<Integer> node3 = new Node<>(20);
        node3.setNext(node4);
        Node<Integer> node2 = new Node<>(10);
        node2.setNext(node3);
        Node<Integer> node1 = new Node<>(100);
        node1.setNext(node2);

        // Call the buildFreqList function
        buildFreqList(node1);

        // Print the modified linked list
        Node<Integer> current = node1;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            if (current.getNext() != null) {
                current = current.getNext();
                System.out.print(current.getValue() + " ");
            }
            current = current.getNext();
        }
    }
}
