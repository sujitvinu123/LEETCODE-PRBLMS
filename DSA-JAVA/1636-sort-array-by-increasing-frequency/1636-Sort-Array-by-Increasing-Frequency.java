class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Map.Entry<Integer,Integer>> m=new ArrayList<>(map.entrySet());
        m.sort((a,b)-> {if(a.getValue()!=b.getValue()){return a.getValue()-b.getValue();} return b.getKey()-a.getKey();});
        int[] arr=new int[nums.length];
        int j=0;
        for(Map.Entry<Integer,Integer> m1:m){
            int v=m1.getKey();
            int k=m1.getValue();
            for(int i=0;i<k;i++){
                arr[j++]=v;
            }
        }
        return arr;
            }
}