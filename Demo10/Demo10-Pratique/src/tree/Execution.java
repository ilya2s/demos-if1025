package tree;

public class Execution {

    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        t1.add(6);
        t1.add(4);
        t1.add(8);
        t1.add(3);
        t1.add(5);
        t1.add(7);
        t1.add(9);

        System.out.println("========================================");
        System.out.println("Contains 5 ? : " + t1.contains(5));
        System.out.println("Contains 0 ? : " + t1.contains(0));

        System.out.println("========================================");
        System.out.println("Traverse In-Order");
        t1.traverseInOrder(t1.root);
        System.out.println();

        System.out.println("========================================");
        System.out.println("Traverse Pre-Order");
        t1.traversePreOrder(t1.root);
        System.out.println();

        System.out.println("========================================");
        System.out.println("Traverse Post-Order");
        t1.traversePostOrder(t1.root);
        System.out.println();
    }
}
