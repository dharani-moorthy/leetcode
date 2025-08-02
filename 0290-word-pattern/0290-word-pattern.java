import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" "); 

        if (a.length != pattern.length()) return false;

        HashMap<Character, String> tab = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (tab.containsKey(ch)) {
                
                if (!tab.get(ch).equals(a[i])) {
                    return false;
                }
            } else {
                
                if (tab.containsValue(a[i])) {
                    return false;
                }
                tab.put(ch, a[i]);
            }
        }

        return true;
    }
}