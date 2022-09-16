class Solution {
    public int mySqrt(int x) {
        int start=1,end=x, result=0;
        while(start<end){
        int mid = start+(end-start)/2;
        if(mid<x/mid){
            start=mid+1;
        }else{
            end=mid;
        }
    }
    return (start==x/start)?start:start-1;
    }
}