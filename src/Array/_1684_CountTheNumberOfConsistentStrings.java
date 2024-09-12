package Array;

public class _1684_CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
