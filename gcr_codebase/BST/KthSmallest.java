import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class KthSmallest {
    public static int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();

            count++;

            if (count == k)
                return current.val;

            current = current.right;
        }

        throw new IllegalArgumentException("Invalid K");
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int k = 3;
        System.out.println(k + "rd Smallest = " + kthSmallest(root, k));
    }
}