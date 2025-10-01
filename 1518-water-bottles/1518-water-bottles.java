class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newbottle=empty/numExchange;
            total+=newbottle;
            empty=empty%numExchange+newbottle;
        }
        return total;
    }
}