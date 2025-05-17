class Solution {
    public boolean isMatch(String s, String p) {
       int [] a = s.chars().toArray();
       int []b =p.chars().toArray();
       
        return s.matches(p);

    }
}