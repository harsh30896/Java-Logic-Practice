package test;

import java.util.Queue;
import java.util.*;
public class test2 {
    private int[][] maze;
    private int numRows;
    private int numCols;
    private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public test2(int[][] maze) {
        this.maze = maze;
        this.numRows = maze.length;
        this.numCols = maze[0].length;
    }

    public List<int[]> solve(int[] start, int[] end) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, int[]> path = new HashMap<>();

        queue.offer(start);
        visited.add(Arrays.toString(start));
        path.put(Arrays.toString(start), null);

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (Arrays.equals(curr, end)) {
                return buildPath(path, curr);
            }
            for (int[] dir : directions) {
                int[] next = {curr[0] + dir[0], curr[1] + dir[1]};
                if (isValid(next) && !visited.contains(Arrays.toString(next))) {
                    queue.offer(next);
                    visited.add(Arrays.toString(next));
                    path.put(Arrays.toString(next), curr);
                }
            }
        }
        return null;
    }

    private boolean isValid(int[] point) {
        int row = point[0];
        int col = point[1];
        return row >= 0 && row < numRows && col >= 0 && col < numCols && maze[row][col] != 1;
    }

    private List<int[]> buildPath(Map<String, int[]> path, int[] end) {
        List<int[]> result = new ArrayList<>();
        int[] curr = end;
        while (curr != null) {
            result.add(curr);
            curr = path.get(Arrays.toString(curr));
        }
        Collections.reverse(result);
        return result;
    }
}
