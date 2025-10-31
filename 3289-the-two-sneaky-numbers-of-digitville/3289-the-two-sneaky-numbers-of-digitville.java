class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        if(nums.length<4) return new int []{};
        Arrays.sort(nums);
        int count=0;
        int [] a=new int[2];
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    a[count++] = nums[i];
                    i++;
                   if( count==2) break;
                }

        }
        if(count==2) return a;
        return new int[] {};
    }
}
