class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        
        for(int i=0;i<s.length();i++){
            String a="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(a.indexOf(ch)!=-1){
                    break;

                }
                a+=ch;
                max=Math.max(max,a.length());
            }
        }

        return max;
    }
}