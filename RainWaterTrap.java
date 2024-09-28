public class RainWaterTrap {
    public int trap(int[] height) {
        int sum = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // leftMax array counting
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // rightMax array counting
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        RainWaterTrap rwt = new RainWaterTrap();
        System.out.println(rwt.trap(new int[]{3, 1, 2, 4, 0, 1, 3, 2}));
    }
}
