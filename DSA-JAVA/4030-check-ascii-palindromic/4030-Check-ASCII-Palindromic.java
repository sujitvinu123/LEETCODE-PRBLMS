class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        int ch=s.charAt(i);
        String b=String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0');
        sb.append(b);}
        String s1=sb.toString();
        String s3=sb.reverse().toString();
       
       return s1.equals(s3);
    }
}