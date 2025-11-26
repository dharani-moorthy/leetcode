class Solution {
    public int alternateDigitSum(int n) {
        int res = 0;
        char[] a = String.valueOf(n).toCharArray();
        for (int i = 0; i < a.length; i++) {
            int digit = a[i] - '0'; 
            if (i % 2 != 0) {
                res -= digit;      
            } else {
                res += digit;
            }
        }
        
        return res;
    }
}