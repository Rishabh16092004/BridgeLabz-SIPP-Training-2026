import java.util.*;

public class DFSAllPath {

    public static void allRoutes(Map<Integer, List<Integer>> roads, int current, int target,
            List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutes) {

        path.add(current);
        visited.add(current);
        if (current == target) {
            allRoutes.add(new ArrayList<>(path));
        } else {

            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutes(roads, next, target, path, visited, allRoutes);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));
        graph.put(5, new ArrayList<>());

        List<List<Integer>> result = new ArrayList<>();

        allRoutes(graph, 1, 5, new ArrayList<>(),new HashSet<>(), result);

        System.out.println(result);
    }
}