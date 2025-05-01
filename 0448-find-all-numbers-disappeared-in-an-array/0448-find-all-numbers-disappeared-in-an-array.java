class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                sort(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                a.add(j+1); 
            }
        }
        return a;
    }
        static void sort(int []nums,int first,int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
            
        }
       
    }
