import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        for (int key : counter.keySet()) {
            if (counter.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, counter.get(key) + counter.get(key + 1));
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println(result);
    }
}
