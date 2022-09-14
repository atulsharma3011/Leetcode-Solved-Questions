class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int digit=(int)Math.log10(nums[i])+1;
            if(digit%2==0)
            {
                ans++;
            }
        } 
        return ans;
    }
}