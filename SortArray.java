//LeetCode 451. Sort Characters By 
//Link: https://leetcode.com/problems/sort-characters-by-frequency/
//Given a string, sort it in decreasing order based on the frequency of characters.
//Input: "tree"
//Output: "eert"

import java.util.*;
public class SortArray {
    public static String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(freqMap.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
