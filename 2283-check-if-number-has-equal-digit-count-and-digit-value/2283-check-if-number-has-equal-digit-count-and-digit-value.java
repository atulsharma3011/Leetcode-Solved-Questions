class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
        }
        for(int i=0;i<num.length();i++){
           int x=Integer.parseInt(Character.toString(num.charAt(i)));
            if(map.containsKey(x)){
                map.replace(x,map.get(x)+1);
            }
        }
        for(int i=0;i<num.length();i++){
            int x=Integer.parseInt(Character.toString(num.charAt(i)));
            if(map.get(i)!=x) return false;
            
        }
        return true;
    }
}