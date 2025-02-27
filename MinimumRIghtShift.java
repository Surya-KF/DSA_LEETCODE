import java.util.*;
public class MinimumRIghtShift {
    public static int minRightShift(List<Integer> nums) {
        int n = nums.size();
        int min = nums.get(0);
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
                min = i;
            }
            else if (nums.get(i) == min) {
                return 0;
            }
        }
        return Math.min(minIndex, n - minIndex);
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        System.out.println(minRightShift(nums));
    }
}
