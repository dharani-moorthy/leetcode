class Solution {
    public boolean canAliceWin(int n) {
        int  a=10;
        int b=0;
        while(n>=a){
            n-=a;
            a--;
            b++;
        }
        return a%2==1;
    }
}