class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)==1)return n;
        }
        return -1;
    }
}