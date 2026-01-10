class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String []s=new String[n];
        int [] ne=score.clone();
        Arrays.sort(ne);
        HashMap<Integer,String> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int rev= ne[n-1-i];
            if(i==0) {
                h.put(rev,"Gold Medal");
            }else if(i==1) {
                h.put(rev,"Silver Medal");
            }
            else if(i==2){
                 h.put(rev,"Bronze Medal");
        }else{
            h.put(rev,String.valueOf(i + 1));
        }
        }
        for(int i=0;i<score.length;i++){
            s[i]=h.get(score[i]);
        }

        return s;
    }
}