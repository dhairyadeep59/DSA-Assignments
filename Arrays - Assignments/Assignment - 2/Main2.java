import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;

        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
            if (uniqueCandies.size() == maxCandies) {
                break;
            }
        }

        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = maxCandies(candyType);
        System.out.println(result);
    }
}
