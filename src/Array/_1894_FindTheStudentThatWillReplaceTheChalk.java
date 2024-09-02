package Array;

public class _1894_FindTheStudentThatWillReplaceTheChalk {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;
        for (int i = 0; i < chalk.length; i++) {
            total += chalk[i];
        }

        k %= total;
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        return 0;
    }
}
