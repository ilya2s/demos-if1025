package linked;

public class Execution {

    public static void main(String[] args) {

        System.out.println("============================================================");
        SimpleChainedList s1 = new SimpleChainedList();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println("SimpleChainedList S1 : " + s1);

        System.out.println("============================================================");
        SimpleChainedList s2 = new SimpleChainedList(new Node(4, new Node(5)));
        s2.add(6);
        s2.add(7);
        System.out.println("SimpleChainedList S2 : " + s2);

        System.out.println("============================================================");
        ChainedList l1 = new ChainedList();
        l1.add(8);
        l1.add(9);
        l1.add(0);
        l1.add(1);
        System.out.println("ChainedList L1 : " + l1);

        System.out.println("============================================================");
        ChainedList l2 = new ChainedList(new Node(2, new Node(3)));
        l2.add(4);
        l2.add(5);
        l2.add(6);
        System.out.println("ChainedList L2 : " + l2);

        ChainedList total =  new ChainedList(Calculator.addTwoNumbers(l1.head, l2.head));
        System.out.println("Total : " + total);

    }
}
