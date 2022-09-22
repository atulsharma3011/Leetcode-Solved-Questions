class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long firstMax=Long.MIN_VALUE, secondMax=Long.MIN_VALUE, thirdMax=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>secondMax && nums[i]<firstMax){
                thirdMax=secondMax;
                secondMax=nums[i];
            }
            else if(nums[i]>thirdMax && nums[i]<secondMax){
                thirdMax=nums[i];
            }
        }
        return (int)(thirdMax==Long.MIN_VALUE ? firstMax : thirdMax);
    }
}