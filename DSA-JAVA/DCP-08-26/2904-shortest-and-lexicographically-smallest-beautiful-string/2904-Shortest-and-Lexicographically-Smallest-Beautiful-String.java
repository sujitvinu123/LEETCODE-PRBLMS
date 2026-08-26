class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')list.add(i);
        }
        String ans="";
        for(int i=0;i<list.size()-k+1;i++){
            int st=list.get(i);
            int e=list.get(i+k-1);
            String s1=s.substring(st,e+1);
            if(ans.equals("")|| ans.length()>s1.length()||ans.length()==s1.length()&& s1.compareTo(ans)<0)ans=s1;
        }
        return ans;
    }
}