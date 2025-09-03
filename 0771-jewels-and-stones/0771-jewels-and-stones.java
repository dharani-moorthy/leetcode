class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char [] a=jewels.toCharArray();
        char[] b=stones.toCharArray();
        for(char c:b){
            if(jewels.contains(String.valueOf(c))){
                count++;
            }

        }
        return count;
    }
}