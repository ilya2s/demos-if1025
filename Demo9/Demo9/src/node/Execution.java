package node;

public class Execution {

    public static void main(String[] args) {
        System.out.println("============================================================");
        ChainedList l1 = new ChainedList();
        System.out.println("Liste vide : " + l1);

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

        System.out.println("============================================================");
        ChainedList zero = new ChainedList(new Node(0));
        System.out.println(zero);
    }
}
