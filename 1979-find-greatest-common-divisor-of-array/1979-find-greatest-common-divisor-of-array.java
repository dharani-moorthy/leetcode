class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1=nums[0];
        int num2=nums[nums.length-1];      
        return gets(num1,num2);
    }
        public static int gets(int a,int b){
             while(b!=0){
               int temp=b;
               b=a%b;
               a=temp;
             } 
        return Math.abs(a);
   }
}