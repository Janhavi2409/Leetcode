package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _539_MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            minutes.add(hour * 60 + minute);
        }
        Collections.sort(minutes);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.size() - 1; i++) {
            int diff = minutes.get(i + 1) - minutes.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        int wrapAroundDiff = (1440 - minutes.get(minutes.size() - 1)) + minutes.get(0);
        minDiff = Math.min(minDiff, wrapAroundDiff);

        return minDiff;
    }
}
