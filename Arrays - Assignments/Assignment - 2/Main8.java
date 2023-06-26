public class Main8 {
    public static int minimizeScore(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        int initialScore = maxNum - minNum;

        if (k >= initialScore) {
            return 0;
        }

        int newMin = Math.min(minNum + k, maxNum - k);
        int newMax = Math.max(maxNum - k, minNum + k);

        return newMax - newMin;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minimizeScore(nums, k);
        System.out.println(result);
    }
}
