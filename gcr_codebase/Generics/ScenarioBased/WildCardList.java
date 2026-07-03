import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class Repository<T> {
    private List<T> data = new ArrayList<>();

    public void save(T obj) {
        data.add(obj);
    }

    public List<T> getAll() {
        return data;
    }
}

class GenericUtility {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static double sum(List<? extends Number> list) {

        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    public static void addNumbers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }
}


public class WildCardList {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Rishabh", 21);

        System.out.println("Pair: " + pair);

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Peek = " + stack.peek());
        System.out.println("Pop = " + stack.pop());

        Integer[] numbers = {5, 10, 25, 15};

        System.out.println("Maximum = " + GenericUtility.findMax(numbers));

        Repository<Student> studentRepo = new Repository<>();

        studentRepo.save(new Student(101, "Aman"));
        studentRepo.save(new Student(102, "Riya"));

        System.out.println("\nStudents");
        GenericUtility.printList(studentRepo.getAll());

        Repository<Employee> employeeRepo = new Repository<>();

        employeeRepo.save(new Employee(1, "Rahul"));
        employeeRepo.save(new Employee(2, "Karan"));

        System.out.println("\nEmployees");
        GenericUtility.printList(employeeRepo.getAll());
        List<Integer> list = Arrays.asList(10, 20, 30);

        System.out.println("\nSum = " + GenericUtility.sum(list));
        List<Number> numList = new ArrayList<>();

        GenericUtility.addNumbers(numList);

        System.out.println("After Adding:");
        GenericUtility.printList(numList);
    }
}