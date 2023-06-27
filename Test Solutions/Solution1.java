import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;  // pointer for non-zero elements
        int right = 0;  // pointer for iterating through the array
        
        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap non-zero element with the element at the left pointer
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;  // Increment left pointer
            }
            right++;  // Increment right pointer
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0, 2, 3, 0, 5};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
