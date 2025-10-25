class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int week=n/7;
        int A =n%7;
        for(int i=0;i<week;i++){
                sum+=7*(i+1)+21;
            }
            for(int i=0;i<A;i++){
                sum+=(week+i)+1;
            }

        return sum;
    }
}