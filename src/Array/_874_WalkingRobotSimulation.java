package Array;

import java.util.HashSet;
import java.util.Set;

public class _874_WalkingRobotSimulation {
    private int helper(int x, int y) {
        return x * 60010 + y;
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int[] directions = {0, 1, 0, -1, 0};
        Set<Integer> s = new HashSet<>(obstacles.length);
        for (var e : obstacles) {
            s.add(helper(e[0], e[1]));
        }
        int ans = 0;
        int k = 0;
        int x = 0;
        int y = 0;

        for (int c : commands) {
            if (c == -2) {
                k = (k + 3) % 4;
            } else if (c == -1) {
                k = (k + 1) % 4;
            } else {
                while (c-- > 0) {
                    int nx = x + directions[k];
                    int ny = y + directions[k + 1];
                    if (s.contains(helper(nx, ny))) {
                        break;
                    }
                    x = nx;
                    y = ny;
                    ans = Math.max(ans, x * x + y * y);
                }
            }
        }
        return ans;
    }
}
