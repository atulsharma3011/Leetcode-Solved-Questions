class Solution {
    public boolean checkOnesSegment(String s) {
        int s1=0, s2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1' && s1==0)
                s1=1;
            else if(s.charAt(i)=='0' && s1==1)
                s2=1;
            else if(s.charAt(i)=='1' && s1==1 && s2==1)
                return false;
        }
        return true;
    }
}