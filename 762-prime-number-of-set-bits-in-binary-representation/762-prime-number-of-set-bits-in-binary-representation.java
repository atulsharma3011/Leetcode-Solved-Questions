class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int num=bitCount(i);
            if(isPrime(num))
                count++;
        }
        return count;
    }
    public int bitCount(int num)
    {
        int c=0;
        while(num>0)
        {
            c++;
            num=num&(num-1);
        }
        return c;
    }
    public boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}