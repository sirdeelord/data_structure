public class SList {
    public static class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** the first item (if it exists) is at sentinel.next  */
    private IntNode sentinel;
    private int size;

    /** create an empty SList */
    public SList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    /** contructor with param */
    public SList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }


    /** add x to the first item in the list */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** return the first item in the list */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** add an item to the end of the list */
    public void addLast(int x) {
        size += 1;

        IntNode p = sentinel;
        /* move p until it reaches the end of the list */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /*create a list of one integer, namely 10 */
        SList L = new SList();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }
}

