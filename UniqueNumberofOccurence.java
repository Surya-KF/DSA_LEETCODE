import java.util.*;
public class UniqueNumberofOccurence {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        HashSet<Integer> uniqueFreq = new HashSet<>(freqMap.values());
        
        return freqMap.size() == uniqueFreq.size();
    }

    public static void main(String[] args) {
        // Test case
        int[] arr = {1, 2, 2, 1, 3};
        System.out.println("Are occurrences unique? " + uniqueOccurrences(arr));
    }
}
