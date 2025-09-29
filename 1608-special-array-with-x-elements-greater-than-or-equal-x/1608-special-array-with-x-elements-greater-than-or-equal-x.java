class Solution {
    public int specialArray(int[] nums) {
        List<Integer> a=new ArrayList<>();
        for(int b:nums){
            a.add(b);
        }
        for(int x=0;x<=nums.length;x++){
            int count=0;
            for(int c:nums){
                if(c>=x) count++;
            }if(count==x) return x;
        }
        return -1;
    }
}