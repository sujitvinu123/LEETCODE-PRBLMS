class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int s1=0;
        for(char ch:s.toCharArray()){
           if(st.isEmpty()){st.push(ch);s1++;}
           else {
            if(st.peek()=='('&& ch==')' ){st.pop();s1--;}
            else{st.push(ch); s1++;}
           }
        }
        return s1;
        
    }
}