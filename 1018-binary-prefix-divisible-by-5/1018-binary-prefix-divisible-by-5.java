class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> a=new ArrayList<>();
        int num=0;
        for(int i=0;i<nums.length;i++){
            num=(num*2+nums[i])%5;
            a.add(num==0);
    
    }
    return a;
}
}