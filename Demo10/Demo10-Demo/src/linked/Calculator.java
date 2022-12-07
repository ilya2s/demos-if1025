package linked;

public interface Calculator {

    static Node addTwoNumbers(Node l1, Node l2) {
        int sum = l1.val + l2.val;
        int val = (sum % 10 == sum) ? sum : (sum - 10);
        int reste = sum / 10;

        if (l1.next == null && l2.next == null && reste == 0) return new Node(val);     // Sortie

        if (l1.next == null) l1.next = new Node();
        if (l2.next == null) l2.next = new Node();


        l1 = new Node(l1.next.val, l1.next.next);
        l1.val += reste;
        l2 = new Node(l2.next.val, l2.next.next);

        return new Node(val, addTwoNumbers(l1, l2));
    }
}
