class Solution {
    public String frequencySort(String s) {
        String res="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> m=new ArrayList<>(map.entrySet());
        m.sort((a,b)-> {if(a.getValue()!=b.getValue()){return b.getValue()-a.getValue();} return b.getKey()-a.getKey();});
        for(Map.Entry<Character,Integer> v:m){
            char x=v.getKey();
            int y=v.getValue();
            for(int i=0;i<y;i++){
               res+=x;
            }
        }
        return res;
    }
}