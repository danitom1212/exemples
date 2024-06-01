package binNodePack;

public class BinNode {
    private int value;
    private BinNode next;
    private BinNode prev;

    // קונסטרוקטור
    public BinNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    // Getters ו-Setters
    // ...

    // פעולה שממיינת את השרשרת כך שהערכים הזוגיים יהיו בתחילה והאי-זוגיים בסופה
    public static BinNode rearrange(BinNode head) {
        if (head == null) {
            return null;
        }

        // יצירת חולית ראשית וסופית לערכים זוגיים
        BinNode evenStart = null, evenEnd = null;
        // יצירת חולית ראשית וסופית לערכים אי-זוגיים
        BinNode oddStart = null, oddEnd = null;

        // הלולאה עוברת על כל החוליות בשרשרת
        BinNode current = head;
        while (current != null) {

            if (current.value % 2 == 0) { // אם הערך זוגי
                // הכנסת החוליה לרשימת הערכים הזוגיים
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = current;
                }
            } else { // אם הערך אי-זוגי
                // הכנסת החוליה לרשימת הערכים האי-זוגיים
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = current;
                }
            }
            // המעבר לחוליה הבאה בשרשרת
            current = current.next;
        }

        // אם אין ערכים זוגיים, החזרת רשימת האי-זוגיים
        if (evenStart == null) {
            return oddStart;
        }

        // הכנסת רשימת האי-זוגיים לסוף רשימת הערכים הזוגיים
        evenEnd.next = oddStart;
        if (oddStart != null) {
            oddEnd.next = null;
        }

        // החזרת הרשימה המסודרת
        return evenStart;
    }

    // פונקציה להדפסת השרשרת
    public static void printList(BinNode head) {
        BinNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinNode node1 = new BinNode(1);
        BinNode node2 = new BinNode(2);
        BinNode node3 = new BinNode(3);
        BinNode node4 = new BinNode(4);
        BinNode node5 = new BinNode(5);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        System.out.println("Original list:");
        printList(node1);

        BinNode rearrangedHead = rearrange(node1);
        System.out.println("Rearranged list:");
        printList(rearrangedHead);
    }
}
