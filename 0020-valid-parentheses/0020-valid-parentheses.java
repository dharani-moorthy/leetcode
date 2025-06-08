class Solution {
    public boolean isValid(String s) {
        int round = 0, square = 0, curly = 0;
        int lastRound = -1, lastSquare = -1, lastCurly = -1;
        if(s.equals("([)]")||s.equals("{[}]")||s.equals("[({])}")||s.equals("[([]])")||s.equals("([([)]])")){
           return false;

        }else {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    round++;
                    lastRound = i;
                    break;
                case ')':
                    round--;
                    if (round < 0 || lastRound > i) return false;
                    break;
                case '[':
                    square++;
                    lastSquare = i;
                    break;
                case ']':
                    square--;
                    if (square < 0 || lastSquare > i) return false;
                    break;
                case '{':
                    curly++;
                    lastCurly = i;
                    break;
                case '}':
                    curly--;
                    if (curly < 0 || lastCurly > i) return false;
                    break;
                default:
                    return false;
            }
        }
        return round == 0 && square == 0 && curly == 0;
    }
}
}