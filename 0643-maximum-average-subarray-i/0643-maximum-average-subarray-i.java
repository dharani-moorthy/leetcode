class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        if(nums.length==1) return (double) nums[0];
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxsum=sum;
        for(int j=k;j<nums.length;j++){
            sum+= nums[j]-nums[j-k];
            maxsum=Math.max(maxsum,sum);

        }
        return maxsum/k;
        
        }
    }