import java.util.*;

public class Merge_intervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);

            if (intervals[i][0] <= last[1]) {
                
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        int[][] ans = merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : ans) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
