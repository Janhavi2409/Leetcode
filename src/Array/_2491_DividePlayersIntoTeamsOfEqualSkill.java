package Array;

import java.util.Arrays;

public class _2491_DividePlayersIntoTeamsOfEqualSkill {
    public long dividePlayers(int[] skill) {
        long result = 0;
        int l = 0;
        int r = skill.length - 1;
        Arrays.sort(skill);
        int targetSum = skill[l] + skill[r];
        while (l < r) {
            if ((skill[l] + skill[r]) != targetSum) {
                return -1;
            }
            result += (skill[l] * skill[r]);
            l++;
            r--;
        }
        return result;
    }
}
