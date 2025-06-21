import java.util.Arrays;

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);
        int res = Integer.MAX_VALUE;

        for (int target = 0; target <= word.length(); target++) {
            int deletions = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 0) continue;
                if (freq[i] > target + k) {
                    deletions += freq[i] - (target + k);
                } else if (freq[i] < target) {
                    deletions += freq[i]; 
                }
            }
            res = Math.min(res, deletions);
        }

        return res;
    }
}