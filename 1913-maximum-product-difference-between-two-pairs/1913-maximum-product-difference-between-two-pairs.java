class Solution {
    public int maxProductDifference(int[] b) {
       Arrays.sort(b);
       int n=b.length;
       int max1=b[n-1];
       int max2=b[n-2];
       int min1=b[0];
       int min2=b[1];
       int a=(max1*max2)-(min1*min2);
       return a;
        
    }
}