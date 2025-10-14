class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int b = 0;
        for (int num:nums) {
            if (num % 2 == 0) {
                b |= num;
            }
        }
        return b;
    }
}