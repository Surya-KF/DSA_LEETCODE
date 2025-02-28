public class MaximumPalindromesAfterOperations {
    public static int maxPalindromesAfterOperations(String[] words){
        int n = words.length;
        int[] count = new int[26];
        for(int i = 0; i < n; i++){
            count[words[i].charAt(0) - 'a']++;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(count[words[i].charAt(0) - 'a'] > 0){
                count[words[i].charAt(0) - 'a']--;
                ans++;
            }
            else{
                count[words[i].charAt(0) - 'a']++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String[] words = {"cd","ef","a"};
        System.out.println(maxPalindromesAfterOperations(words));
    }
}