import str_queue1.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex01 {

    public static void main(String[] args) {


        //declare a Queue

        Queue<Integer> student_grades= new LinkedList<Integer>();
        Queue<Integer> student_pass= new LinkedList<Integer>();
        student_grades.add(100);
        student_grades.add(70);
        student_grades.add(80);
        student_grades.add(90);
        student_grades.add(76);
        student_grades.add(61);
        student_grades.add(99);
        student_grades.add(63);
        student_grades.add(100);
        student_grades.add(98);
        student_grades.add(59);
        student_pass.add(3);
        student_pass.add(3);
        student_pass.add(3);
        student_pass.add(2);

        Queue<Double> student_grades1=averageQueue(student_grades,student_pass);
        System.out.println(student_grades1);
                // יצירת הרשרת הראשונה
                Node<Integer> list = new Node<>(3);
                list.next = new Node<>(7);
                list.next.next = new Node<>(2);
                list.next.next.next = new Node<>(5);
                list.next.next.next.next = new Node<>(7);
                list.next.next.next.next.next = new Node<>(8);

                int numToFind = 7;
                int result = distance(list, numToFind);

                if (result != -1) {
                    System.out.println("The distance of " + numToFind + " is: " + result);
                } else {
                    System.out.println(numToFind + " was not found in the list.");
                }
            }

        public static Queue<Double> averageQueue(Queue<Integer> marks, Queue<Integer> tests){
        double sum=0;
        int inx=0;
        Queue<Double> student_avg= new LinkedList<Double>();

        while (!marks.isEmpty()){
            sum=marks.poll();
inx=inx+1;
if (inx ==tests.peek()){
    student_avg.add(sum/tests.poll());
sum=0;
inx=0;
}
        }
        return student_avg;
    }
    public static int distance(Node<Integer> lst, int num) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int distanceFromStart = 0;
        int distanceFromEnd = 0;

        Node<Integer> current = lst;
        int index = 0;
        // עבר על הרשימה כדי למצוא את המרחקים מההתחלה ומהסוף למספר num
        while (current != null) {
            if (current.data == num) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index; }
                lastOccurrence = index;
            }
            index++;
            current = current.next;
        }
        // אם המספר לא נמצא ברשימה, החזרת -1
        if (firstOccurrence == -1) {
            return -1; }
        // חישוב המרחקים מההתחלה ומהסוף
        current = lst;
        index = 0;
        while (current != null) {
            if (index == firstOccurrence) {
                distanceFromStart = index; }
            if (index == lastOccurrence) {
                distanceFromEnd = lst.size() - index - 1; }
            index++;
            current = current.next;
        }
        return distanceFromStart + distanceFromEnd;
    }




}
