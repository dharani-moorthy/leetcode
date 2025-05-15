class Solution {
    public int scoreOfString(String s) {
        int Score=0;
        for(int i=0;i<s.length()-1;i++){
            Score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return Score;
        
    }
}