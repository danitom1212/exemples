package str_queue1;

import binNodePack.ex005;

import java.util.*;

public class ex010 {
        public static void main(String[] args) {
            //מתודה מקבלת רשימה מחלקת את הקטנים בצד את הגדולים בצד השני
            Queue<Integer> queue = new LinkedList<>();
            queue.add(5);
            queue.add(2);
            queue.add(7);
            queue.add(1);
            queue.add(9);
            int k = 3;
            putinPlace(queue,k);
            System.out.println(queue); // ידפיס: [1, 9, 5, 2, 7]
        }


    public static int putinPlace(Queue<Integer > q, int num) {
            int inx=0;
            Queue<Integer> smeler = new LinkedList<>();
            Queue<Integer> bigger = new LinkedList<>();
            while (!q.isEmpty()) {

                int cur = q.poll();
                if (cur > num) bigger.add(cur);
                else smeler.add(cur);
            }

            inx=smeler.size();
            while (!smeler.isEmpty()) {
                q.add(smeler.poll());
            }
            q.add(num);

            while (!bigger.isEmpty()) {
                q.add(bigger.poll());
            }
            return inx;
        }
        public static void moveForword(Queue<Integer> q,int k) {
            // העברת ה-K איברים האחרונים מהרשימה לראש הרשימה
            List<Integer> temp = new ArrayList<>(q);//רשימה מסוג רשימה אם הרשימה המקורית


            for (int i = 0; i < k; i++) {
                temp.add(0, temp.remove(temp.size() - 1));


            }
            q.clear();
            q.addAll(temp);
        }
    }
