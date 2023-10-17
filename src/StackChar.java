import java.lang.Character;

public class StackChar {
    private static class Node {
        Character letter; // object in node
        Node next; // next Node in linked list

        // default constructor
        public Node() {
            letter = 0;
            next = null;
        }
        // constructor
        public Node(Character c, Node n) {
            letter = c;
            next = n;
        }
    }
    private Node head; // first node in linked list

    // FINISH ME
}
