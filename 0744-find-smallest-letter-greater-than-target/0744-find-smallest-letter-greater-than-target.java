class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a = 0;
        int b = letters.length - 1;
        while (a <= b) {
            int c = a + (b - a) / 2;
            if (letters[c] <= target) {
                a = c + 1;
            } else {
                b = c - 1;
            }
        }

        return letters[a % letters.length];
    }
}