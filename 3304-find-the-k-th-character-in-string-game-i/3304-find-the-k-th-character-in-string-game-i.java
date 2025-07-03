class Solution {
    public char kthCharacter(int k) {
        int sa=Integer.bitCount(k-1);
        return (char)('a'+sa);
    }
}