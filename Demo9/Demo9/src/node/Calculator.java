package node;

public interface Calculator {

    static Node addTwoNumbers(Node n1, Node n2) {
        int sum = n1.val + n2.val;

        int val = (sum % 10 == sum) ? sum : sum - 10;
    }
}
