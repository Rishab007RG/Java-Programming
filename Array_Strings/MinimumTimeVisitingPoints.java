package LogicsProgram.Array_Strings;

public class MinimumTimeVisitingPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]); // |x2 - x1|
            int dy = Math.abs(points[i][1] - points[i - 1][1]); // |y2 - y1|
            time += Math.max(dx, dy); // Max steps needed
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points)); // Output: 7
    }
}

