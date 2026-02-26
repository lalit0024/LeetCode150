import java.util.*;

public class BreadthFirstTraversalGraph {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        Queue<Integer> q = new LinkedList<>();
        Boolean[]  visited = new Boolean[adj.size()];
        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()) {




        }

    }
}
