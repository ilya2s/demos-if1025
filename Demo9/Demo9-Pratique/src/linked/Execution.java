package linked;

public class Execution {

    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("An empty ChainedList");
        ChainedList l1 = new ChainedList();
        System.out.println(l1);

        System.out.println("===================================================");
        System.out.println("Adding elements to ChainedList");
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);

        System.out.println("===================================================");
        System.out.println("Another ChainedList");
        ChainedList l2 = new ChainedList(new Node(0));
        System.out.println(l2);

        System.out.println("===================================================");
        System.out.println("Adding elements to ChainedList");
        for (int i = 1; i < 6; i++) {
            l2.add((int) (Math.random() * i) + 1);
        }
        System.out.println(l2);

        System.out.println("===================================================");
        System.out.println("Inverse addition");
        ChainedList l3 = new ChainedList(Calculator.addTwoNumbers(l1.head, l2.head));
        System.out.println(l3);
    }
}
