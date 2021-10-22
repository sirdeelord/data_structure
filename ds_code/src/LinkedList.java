public class LinkedList {
    public static void main(String[] args) {

        //linked list implementation

        Node head, middle, last;
        head = new Node();
        middle = new Node();
        last = new Node();

        //add data
        head.data = 10;
        middle.data = 20;
        last.data = 30;

        //link the list
        head.next = middle;
        middle.next = last;
        last.next = null;

        Node temp = head;

        //print the linkedList
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;
    }
}
