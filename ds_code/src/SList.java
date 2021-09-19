public class SList<T> {
    /** nested class */
    private class Node {
        public T item;
        public Node next;
    
        public Node(T i, Node n) {
            item = i;
            next = n;
        }
    }

    /** the first item (if it exists) is at sentinel.next  */
    private Node sentinel;
    private int size;

    /** create an empty SList */
    public SList() {
        sentinel = new Node(null, sentinel);
        size = 0;
    }

    /** contructor with param */
    public SList(T x) {
        sentinel = new Node(x, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    /** add x to the first item in the list */
    public void addFirst(T x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    /** return the first item in the list */
    public T getFirst() {
        return sentinel.next.item;
    }

    /** add an item to the end of the list */
    public void addLast(T x) {
        size += 1;

        Node p = sentinel;
        /* move p until it reaches the end of the list */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new Node(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /*create a list of one integer, namely 10 */
        SList<Integer> L = new SList<>();
        SList<String> s = new SList<>("Saddy");
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        
        System.out.println(L.getFirst());
        System.out.println(s.getFirst());
    }
}

