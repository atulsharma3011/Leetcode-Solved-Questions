class Solution {
    public boolean judgeCircle(String moves) {
        int r1=0,r2=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R')
                r1++;
            if(moves.charAt(i)=='L')
                r1--;
            if(moves.charAt(i)=='U')
                r2++;
            if(moves.charAt(i)=='D')
                r2--;
        }
        return r1==0 && r2==0?true:false;
    }
}