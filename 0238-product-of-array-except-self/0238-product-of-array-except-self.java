class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] b=new int[n];
        b[0]=1;
        for(int i=1;i<n;i++){
           b[i]=b[i-1]*nums[i-1];
        }
        int s=1;
        for(int j=n-1;j>=0;j--){
            b[j]*=s;
            s*=nums[j];
        }
        return b;
    }
}