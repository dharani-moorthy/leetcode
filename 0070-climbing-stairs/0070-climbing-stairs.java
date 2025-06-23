class Solution {
    public int climbStairs(int n) {
        if(n<=2){
        return n;
    }
        int step1=2;
        int step2=1;
        int step=0;
        for(int i=3;i<=n;i++){
            step=step1+step2;
            step2=step1;
            step1=step;
        }
        return  step;
    }
}