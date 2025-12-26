class Solution {
    public int bestClosingTime(String customers) {
        // Special case: all characters are 'N'
        if (customers.chars().allMatch(c -> c == 'N')) {
            return 0;
        }

        char[] ch = customers.toCharArray();
        int n = 0;
        int y = 0;

        for (char c : ch) {
            if (c == 'N') {
                n++;
            } else if (c == 'Y') {
                y++;
            }
        }

        return y - n;
    }
}