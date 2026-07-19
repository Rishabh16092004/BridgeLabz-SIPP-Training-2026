import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class PostorderTraversal {
    static void deleteFolderTree(Node node) {
        if (node == null)
            return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        System.out.print(node.val + " ");
    }

    static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        deleteFolderTree(root);
    }
}