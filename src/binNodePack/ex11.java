package binNodePack;

import EyalClass.Spring2021.Q7.Node;

import java.util.*;

public class ex11 {
    void max(){
        Stack<Stack> tS = new Stack<>();
        Stack<Integer> t0 = new Stack<>(), t1 = new Stack<>(), t2 = new Stack<>() ;
        tS.add(t0);
        tS.add(t1);
        tS.add(t2);
        int t=0;
        
        }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(2);
        queue.add(7);
        queue.add(1);
        queue.add(9);
        int k = 3;
        System.out.println(putinPlace(queue, k));
        System.out.println(queue); // ידפיס: [1, 9, 5, 2, 7]
        putinForword(queue, k);
        System.out.println(queue.toString());
        chackInPlace(queue);
        System.out.println(queue.toString());
        Node<Integer> node4 = new Node<>(20);
        node4.setNext(null);
        Node<Integer> node3 = new Node<>(-1);
        node3.setNext(node4);
        Node<Integer> node2 = new Node<>(380);
        node2.setNext(node3);
        Node<Integer> node1 = new Node<>(100);
        node1.setNext(node2);
averageList1(node1);
        System.out.println(averageList1(node1).getNext());

        // Call the buildFreqList function

        // Print the modified linked list

    }
    public static void buildFreqList(Node<Integer> chain){
        Node<Double> node1 = new Node<Double>(null);
        Node<Integer> node2 = chain;
        Node<Integer> node3 =node2;
        Node<Double> res = node1;

        while (node2 != null) {
            int num = node2.getValue();
            while (node3 != null) {
                int cuont=0;
                if (num == node2.getValue()) {
                cuont++;

                }
                node1.setValue((double) num);
                node1.setNext(cuont);
                node3=node3.getNext();

            }
            node2=node2.getNext();
            node3=node2;
        }

    }
    public static Node<Double> averageList1(Node<Integer> lst) {
        Node<Double> node1 = new Node<Double>(null);
        Node<Integer> node2 = lst;
        Node<Double> res = node1;
         double sum = 0;
        double inx = 0;
        int a=0;
        while (node2 != null) {

            if (node2.getValue() == -1) {
                a++;
                node1.setValue((double) (sum / inx));
                sum = 0;
                inx = 0;
                node1 = node1.getNext();
            }
                inx = inx + 1;
                sum = sum + node2.getValue();

                node2 = node2.getNext();
        }

        return res;
    }


    public static int putinPlace(Queue<Integer > q, int num){

    Queue<Integer> s= new LinkedList<Integer>();
    Queue<Integer> l= new LinkedList<Integer>();
int inx=0;
    while (!q.isEmpty()){
    int cur= q.poll();
    if (cur>num)l.add(cur);
    else s.add(cur);
}
    inx=s.size()+1;
while (!s.isEmpty()){
    q.add(s.poll());
}
q.add(num);
        while (!l.isEmpty()){
            q.add(l.poll());
        }
        return inx;
    }
    public static void putinForword(Queue<Integer > q, int k) {
        List<Integer> temp = new ArrayList<>(q);//רשימה מסוג רשימה אם הרשימה המקורית

        int inx=0;
       for (int i=0;i<k;i++) {
           temp.add(0, temp.remove(temp.size() - 1));
       }
        q.clear();
        q.addAll(temp);
        }

    public static void chackInPlace(Queue<Integer > q){
        int sum=0;
        Queue<Integer> copy = new LinkedList<Integer>();
            Queue<Integer> s = new LinkedList<Integer>();
            Queue<Integer> l = new LinkedList<Integer>();
while (!q.isEmpty()){
    int cur1= q.poll();
    copy.add(cur1);
    sum=sum+cur1;
}
while (!copy.isEmpty()) {
    q.add(copy.poll());
}
sum=sum/q.size();

while (!q.isEmpty()){
    int cur=q.poll();
    if (sum< cur)s.add(cur);
    else l.add(cur);
}

        while (!s.isEmpty()) {
            q.add(s.poll());
        }
        q.add(sum);
        while (!l.isEmpty()) {
            q.add(l.poll());
        }





        }
    }
