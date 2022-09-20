class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int end=ans.length;
        for(int i=0;i<end;i++)
        {
            ans[i]= 2*i - n + 1;
        }
        return ans;
    }
}