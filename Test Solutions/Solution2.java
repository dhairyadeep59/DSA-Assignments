import java.util.HashMap;

public class Solution2 {
    public int firstUniqChar(String s) {
        // Create a hashmap to store the character count
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // Iterate through the string and update the count of each character in the hashmap
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // Iterate through the string again and find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String s1 = "leetcode";
        System.out.println(solution.firstUniqChar(s1));  // Output: 0

        String s2 = "loveleetcode";
        System.out.println(solution.firstUniqChar(s2));  // Output: 2

        String s3 = "aabb";
        System.out.println(solution.firstUniqChar(s3));  // Output: -1
    }
}

