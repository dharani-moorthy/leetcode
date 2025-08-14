class Solution {
    public String largestGoodInteger(String num) {
        String maxGood = "";
        
        for (int i = 0; i <= num.length() - 3; i++) {
            char a = num.charAt(i);
            char b = num.charAt(i + 1);
            char c = num.charAt(i + 2);

            if (a == b && b == c) {
                String g = "" + a + b + c;
                if (maxGood.isEmpty() || g.compareTo(maxGood) > 0) {
                    maxGood = g;
                }
            }
        }
        
        return maxGood;
    }
}