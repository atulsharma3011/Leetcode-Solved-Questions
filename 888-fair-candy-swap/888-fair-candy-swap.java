class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : aliceSizes) {
            sumA += num;
            set.add(num);
        }
        for (int num : bobSizes) {
            sumB += num;
        }
        int diff = (sumA - sumB)/2;
        int[] ans = new int[2];
        for (int num : bobSizes) {
            if (set.contains(num + diff)) {
                ans[0] = num + diff;
                ans[1] = num;
                break;
            }
        }
            return ans;
    }
}