package tree;

public class BinaryTree {

    public Node root;


    private Node insert(Node current, int value) {
        if (current == null) return new Node(value);

        if (value < current.value) current.left = insert(current.left, value);
        else if (value > current.value) current.right = insert(current.right, value);
        else return current;

        return current;
    }

    public void add(int val) {
        root = insert(root, val);
    }

    private boolean search(Node current, int value) {
        if (current == null) return false;
        if (current.value == value) return true;

        return (value < current.value) ? search(current.left, value) : search(current.right, value);
    }

    public boolean contains(int value) {
        return search(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node);
        }
    }
}
