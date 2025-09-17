class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);// where bitcount counts the number of 1s in a binary number.
    }
}