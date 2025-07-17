class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List <Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int num=nums.length;
        for(int i=0;i<num;){
            int current=nums[i];
            int count=0;
            while(i<num&&nums[i]==current){
                count++;
                i++;
            }
            if(count>num/3&&!a.contains(current)){
                a.add(current);
            }
        }
     return a;   
}
}