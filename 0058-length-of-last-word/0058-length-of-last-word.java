class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int a=s.lastIndexOf(" ");
        return s.length()-a-1;

    }
}