class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            if (num == 2) {
                ans[i] = -1;
                continue;
            }
            int candidate = -1;
            for (int x = 1; x < num; x++) {
                if ((x | (x + 1)) == num) {
                    candidate = x;
                    break; // smallest found
                }
            }
            ans[i] = candidate;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(2, 3, 5, 7);
        System.out.println(Arrays.toString(sol.minBitwiseArray(nums)));

    }
}