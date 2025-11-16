class Solution {
    public int pivotInteger(int n) {
        int T=n*(n+1)/2;
        for(int x=1;x<=n;x++){
            int l=x*(x+1)/2;
            int r=T-(x-1)*x/2;
            if(l==r){
                return x;
            }
        }
        
        
        return -1;
    }
}