class Solution {
    public String convertDateToBinary(String date) {
        String []s=date.split("-");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        String Ba=Integer.toBinaryString(a);
        String Bb=Integer.toBinaryString(b);
        String Bc=Integer.toBinaryString(c);
        return Ba+"-"+Bb+"-"+Bc;
    }
}