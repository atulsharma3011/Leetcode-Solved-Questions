class Solution {
    public int specialArray(int[] nums) {
        int left = 0;
        int right = nums.length;
        int answer = -1;
        
        while(left <= right) {
            int mid = left + (right-left)/2;
            int counter = 0;
            for (int j = 0; j<nums.length; j++) {
                if (nums[j] >= mid) {
                    counter ++;
                }
            }
            if (mid == counter) {
                answer = mid;
                left = mid + 1;
            } else if (mid > counter) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }
}