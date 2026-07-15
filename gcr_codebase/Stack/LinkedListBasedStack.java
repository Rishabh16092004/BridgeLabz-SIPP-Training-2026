class CallStack {
    static class Node {
        String functionName;
        Node next;

        Node(String functionName) {
            this.functionName = functionName;
        }
    }

    private Node top;
    public void push(String name) {
        Node node = new Node(name);
        node.next = top;
        top = node;
    }

    public String pop() {
        if (isEmpty()) {
            return "No Active Function";
        }
        String ans = top.functionName;
        top = top.next;
        return ans;
    }
    public String peek() {
        if (isEmpty())
            return "Stack Empty";

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        CallStack cs = new CallStack();
        cs.push("main()");
        cs.push("login()");
        cs.push("validateUser()");
        System.out.println("Current Function: " + cs.peek());
        System.out.println("Returned From: " + cs.pop());
        System.out.println("Current Function: " + cs.peek());
    }
}