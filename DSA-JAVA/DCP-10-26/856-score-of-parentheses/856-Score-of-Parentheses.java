class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
           if(ch=='(')st.push(0);
           else {
            int i=st.pop();
            int v=0;
            if(i==0)v=1;
            else {
                v=2*i;
            }
            int p=st.pop();
            st.push(v+p);
           }
        }
        return st.peek();
    }
}