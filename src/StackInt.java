import java.lang.Integer;

public class StackInt {
    private static class Node {
        Integer num; // object in node
        Node next; // next Node in linked list

        // default constructor
        public Node() {
            num = 0;
            next = null;
        }
        // constructor
        public Node(Integer i, Node n) {
            num = i;
            next = n;
        }
    }
    private Node head; // first node in linked list

    // FINISH ME
}
