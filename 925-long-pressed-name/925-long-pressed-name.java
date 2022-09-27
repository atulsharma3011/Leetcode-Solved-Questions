class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length(), t = typed.length(), j = 0 ;
        char ch = ' ';
        for(int i = 0 ; i < t ; i++)
        {
            if((j < n) && (name.charAt(j) == typed.charAt(i)))
            {
                 ch= typed.charAt(i);
                 j++;
            }
            else if(typed.charAt(i) !=ch)
                return false;
        }
        return n == j;
    }
}