class Solution {
    public int hIndex(int[] citations) {
        int []a={0};
        for(int i:a){
            if(citations[i]==i){
                return 0;
            }
            else if(citations.length==1){
                return 1;

            }
            }
        return citations[0];
}
}