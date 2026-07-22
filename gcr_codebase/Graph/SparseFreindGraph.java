import java.util.*;

public class SparseFreindGraph {

    private Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    public void addFriendship(int u, int v) {
        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public boolean isFriend(int u, int v) {
        return friendGraph.getOrDefault(u, Collections.emptySet()).contains(v);
    }

    public static void main(String[] args) {

        SparseFreindGraph graph = new SparseFreindGraph();
        graph.addFriendship(1, 2);
        graph.addFriendship(1, 3);
        graph.addFriendship(2, 4);
        System.out.println(graph.isFriend(1, 2)); // true
        System.out.println(graph.isFriend(2, 3)); // false
    }
}