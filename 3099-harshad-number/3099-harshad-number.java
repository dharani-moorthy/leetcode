class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int orginal=x;
        int sum=0;
        while(x>0){
            int a=x%10;
            sum+=a;
            x/=10;
        }
        if(orginal%sum==0){
            return sum;
        }
        return -1;
    }
}