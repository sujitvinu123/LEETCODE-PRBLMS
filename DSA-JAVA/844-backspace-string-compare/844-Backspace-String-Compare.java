class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(char ch1:s.toCharArray()){
            if(ch1=='#'){if(sb1.length()>0){sb1.deleteCharAt(sb1.length()-1);}}
            else sb1.append(ch1);
        }
        for(char ch2:t.toCharArray()){
            if(ch2=='#'){if(sb2.length()>0){sb2.deleteCharAt(sb2.length()-1);}}
            else sb2.append(ch2);
        }
        String s1=sb1.toString();
        String s2=sb2.toString();
        return (s1.equals(s2));
    }
}