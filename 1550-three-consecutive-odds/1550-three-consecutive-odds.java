class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]%2!=0&&arr[j]%2!=0&&arr[k]%2!=0){
                        return true;
                    }
                    break; 
                }
                break;
            }
        }
        return false;
    }
}