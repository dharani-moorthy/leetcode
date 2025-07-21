 class Solution {
    public String makeFancyString(String s) {
        StringBuilder a = new StringBuilder();
        int count = 1;
        a.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            count = (s.charAt(i) == s.charAt(i - 1)) ? count + 1 : 1;
            if (count < 3) {
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }
}