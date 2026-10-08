class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> s1= new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c: s.toCharArray()){

            if(c=='('){
                if(!s1.isEmpty()){
                    result.append(c);
                }
            
            s1.push(c);
            }
            
            else {
                s1.pop();
                if(!s1.isEmpty()){
                    result.append(c);
                }

                
            }
            

        }
        return  result.toString();
    }
}