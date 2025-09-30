class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        for(int num1:nums1){
          a.add(num1);
    }
        for(int num2:nums2){
            if(a.contains(num2)){
                 return num2;
            }
        }
        return -1;
    }
}