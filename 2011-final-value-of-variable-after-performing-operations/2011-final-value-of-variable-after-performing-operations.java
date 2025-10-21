class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int b=0;
        for(String a:operations){
            if(a.equals("++X")||a.equals("X++")){
                b++;
            }else if(a.equals("--X")||a.equals("X--")){
                b--;
            }
        }
        return b;
    }
}