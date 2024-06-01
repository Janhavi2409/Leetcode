package Array;

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while (l < r) {
            int area = (r - l) * Math.min(height[r], height[l]);
            maxArea = Math.max(area, maxArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
