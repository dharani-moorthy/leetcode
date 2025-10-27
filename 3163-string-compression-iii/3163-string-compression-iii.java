class Solution {
    public String compressedString(String word) {
        char[] words = word.toCharArray();
        int n = words.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = 0;
            for (int j = i + 1; j < n; j++) {
                if (words[i] == words[j]) {
                    a = 1;
                    break;
                }
            }
            if (a == 1)
                continue;
            for (int j = 0; j <= i; j++) {
                if (words[i] == words[j]) {
                    count++;
                }
            }
            while (count > 9) {
           result.append(9).append(words[i]);
               count -= 9;
}
       result.append(count).append(words[i]);

        }
        return result.toString();
    }
}
