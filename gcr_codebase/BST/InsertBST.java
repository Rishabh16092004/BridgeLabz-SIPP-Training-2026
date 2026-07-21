class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class InsertBST {
    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root = insert(root, 60);

        System.out.println("Inorder after insertion:");
        inorder(root);
    }
}