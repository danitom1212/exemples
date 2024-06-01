import java.util.*;

public class dani {
    public static void main(String[] args) {
        //declare a Queue

        Queue<Integer> str_queue1 = new LinkedList<Integer>();
        str_queue1.add(1);
        System.out.println(str_queue1);
        str_queue1.add(2);
        str_queue1.add(3);
        str_queue1.add(3);
        str_queue1.add(5);
        System.out.println( secret(str_queue1));
        System.out.println(IsExist(str_queue1,1));
    }
    public static int what(int number)
    {
        int a = number;
        int sum = 0;
        while(a > 0)
        {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
    public static boolean secret(Queue<Integer> qu) {
        Queue<Integer> temp = new LinkedList<Integer>();
        boolean b = true;
        temp.add(qu.remove());
        while (!qu.isEmpty())
        {
            if (what(qu.element()) != what(temp.element()))
                b = false;
            temp.add(qu.remove());
        }
        while (!temp.isEmpty())
            qu.add(temp.remove());
        return b;
    }
    public static boolean IsExist(Queue <Integer> qu, int number){
        Queue<Integer> temp = new LinkedList<Integer>();
        boolean b = false;
        if (qu.element()!=number)
        temp.add(qu.remove());
        while (!qu.isEmpty())
        {
            if (qu.element() == number) {
                b = true;
            }
            temp.add(qu.remove());
        }
        while (!temp.isEmpty())
            qu.add(temp.remove());
        return b;    }
}