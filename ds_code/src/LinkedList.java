class Node {
    int data;
    Node next;
}

public class LinkedList {
    Node head;

    public void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void print() {
        Node temp = head;
        //print the linkedList
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        
        list.print();
    }
}
