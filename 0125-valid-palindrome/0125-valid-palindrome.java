class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder a=new StringBuilder(s);
        String b=a.reverse().toString();
        if(s.equals(b)){
            return true;
        }
        return false;
    }
}