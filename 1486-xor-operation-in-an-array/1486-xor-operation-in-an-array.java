class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int i=0;
        int ans=0;
        while(i<n)
        {
            nums[i]=start+2*i;
            ans^=nums[i];
            i++;
        }
        return ans;
    }
}