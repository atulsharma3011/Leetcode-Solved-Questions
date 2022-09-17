class Solution {
    public int findKthPositive(int[] arr, int k) {
       int start=0;
        int n=arr.length;
        int end=n-1;
        int missing=compute(arr[n-1],n);
            while(start<=end){
                int mid=start+(end-start)/2;
                missing=compute(arr[mid],mid+1);
                    if(missing>=k)
                        end=mid-1;
                    else
                        start=mid+1;
            }
        if(end==-1)
            return k;
        return arr[end]+k-compute(arr[end],end+1);
    }
    int compute(int actual,int expected){
        return actual-expected;
    }
}