
public class Adding_A_Track {

    static Node head;

    static void insertEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void insertAfter(int key, int value) {
        Node current = head;

        while (current != null && current.val != key)
            current = current.next;

        if (current == null) {
            System.out.println("Node not found");
            return;
        }

        Node newNode = new Node(value);

        newNode.next = current.next;
        current.next = newNode;
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        insertEnd(40);

        display();

        insertAfter(20, 25);

        display();
    }
}