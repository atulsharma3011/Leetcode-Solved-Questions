class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=-1;
        for(int i:map.keySet()){
            if(map.get(i)==i){
                if(i>max) max=i;
            }
        }
        return max; 
    }
}