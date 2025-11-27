class Solution {
    public boolean squareIsWhite(String c) {
        if(c.equals("a2")||c.equals("a4")||c.equals("a6")||c.equals("a8")||
           c.equals("b1")||c.equals("b3")||c.equals("b5")||c.equals("b7")||
           c.equals("c2")||c.equals("c4")||c.equals("c6")||c.equals("c8")||
           c.equals("d1")||c.equals("d3")||c.equals("d5")||c.equals("d7")||
           c.equals("e2")||c.equals("e4")||c.equals("e6")||c.equals("e8")||
           c.equals("f1")||c.equals("f3")||c.equals("f5")||c.equals("f7")||
           c.equals("g2")||c.equals("g4")||c.equals("g6")||c.equals("g8")||
           c.equals("h1")||c.equals("h3")||c.equals("h5")||c.equals("h7")){
            return true;
           }
           return false;
    }
}
