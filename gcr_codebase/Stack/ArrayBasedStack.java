class UndoBuffer {
    private String[] data;
    private int top;
    UndoBuffer(int capacity) {
        data = new String[capacity];
        top = -1;
    }
    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo Buffer Full!");
            return false;
        }
        data[++top] = edit;
        return true;
    }
    public String pop() {
        if (isEmpty()) {
            return "Nothing to undo";
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            return "Undo Buffer Empty";
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        UndoBuffer ub = new UndoBuffer(3);

        ub.push("Typed Hello");
        ub.push("Deleted World");
        ub.push("Inserted Java");

        System.out.println("Top Edit: " + ub.peek());

        System.out.println("Undo: " + ub.pop());

        System.out.println("Top After Undo: " + ub.peek());

        ub.push("Added Stack");
        ub.push("Extra Edit");
    }
}