class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> a=new ArrayList<>();
        for(int num: nums){
            if(num!=0){
                a.add(num);
            }
        }
        int i=0;
        for(int c:a){
            nums[i++]=c;
        }
        while(i<nums.length){
            nums[i++]=0;
        }
    }
}