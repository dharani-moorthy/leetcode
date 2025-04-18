class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int index =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                k++;
                nums[index++]=nums[i];
               
            }

        }
        return k;
    }
}