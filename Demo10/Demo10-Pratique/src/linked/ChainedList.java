package linked;

public class ChainedList {
    public Node head;
    public Node tail;

    public ChainedList() {}

    public ChainedList(Node head) {
        this.head = head;
        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = head;

        sb.append("[");
        while (current != tail) {
            sb.append(current.val).append(", ");
            current = current.next;
        }
        sb.append(tail.val).append("]");

        return sb.toString();
    }
}
