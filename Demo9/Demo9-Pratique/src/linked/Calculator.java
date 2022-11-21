package linked;

public interface Calculator {

    static Node addTwoNumbers(Node n1, Node n2) {
        int sum = n1.val + n2.val;
        int val = (sum % 10 == sum) ? sum : sum - 10;
        int reste = sum / 10;

        if (n1.next == null && n2.next == null && reste == 0) return new Node(val);

        if (n1.next == null) n1.next = new Node();
        if (n2.next == null) n2.next = new Node();

        n1 = n1.next;
        n1.val += reste;
        n2 = n2.next;

        return new Node(val, addTwoNumbers(n1, n2));



    }
}
