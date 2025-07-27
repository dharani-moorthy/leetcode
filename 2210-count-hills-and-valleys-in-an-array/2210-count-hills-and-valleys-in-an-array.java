class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        List<Integer>a=new ArrayList<>();
        a.add(nums[0]);
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                a.add(nums[i]);
            }
        }
        for(int j=1;j<a.size()-1;j++){
            int first=a.get(j-1);
            int second=a.get(j);
            int third=a.get(j+1);
            if((second>first&&second>third)||(second<first&&second<third)){
                count++;
            }
        }
        return count;
    }
}