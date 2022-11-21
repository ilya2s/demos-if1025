package linked;

public class SimpleChainedList {

    public Node head;

    public SimpleChainedList() {}

    public SimpleChainedList(Node head) {
        this.head = head;
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node last = head;
            Node nextOne = head.next;

            while (nextOne != null) {
                last = nextOne;
                nextOne = nextOne.next;
            }

            last.next = new Node(val);
        }
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        StringBuilder sb = new StringBuilder();

        Node current = head;

        sb.append("[");
        while (current.next != null) {
            sb.append(current.val).append(", ");
            current = current.next;
        }
        sb.append(current.val).append("]");

        return sb.toString();
    }
}
