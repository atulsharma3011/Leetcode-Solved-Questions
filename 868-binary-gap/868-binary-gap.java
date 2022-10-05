class Solution {
    public int binaryGap(int n) {
      int currentBit = 0;
        int currentDistance = 0;
        int previousBit = findRightBit(n);
        while (n > 0) {
            currentBit = findRightBit(n);
            currentDistance = Math.max(currentDistance,(currentBit - previousBit));
            previousBit = currentBit;
            n -= (n & -n);
        }
        return currentDistance;
    }
    private int findRightBit(int n) {
        if (n == 0) return 0;
        return (int)(Math.log(n & -n)/Math.log(2) + 1);  
    }
}