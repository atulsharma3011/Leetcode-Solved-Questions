class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(Integer.bitCount(arr[j-1])>Integer.bitCount(arr[j]))
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        return arr;
    }
}