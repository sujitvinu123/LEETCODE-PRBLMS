class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        // int[] arr=new int[seq.length()];
        // int k=0;
        // int depth=0;
        // for(int i=0;i<seq.length();i++){
        //     char ch=seq.charAt(i);
        //     if(st.isEmpty()){st.push('(');arr[k++]=0;depth=1;}
        //     else if(ch=='(' && depth==1){arr[k++]=1;depth=1;}
        //     else if(ch==')' && depth==1){arr[k++]=0;depth=0;}
        //     else {arr[k++]=1;depth=1;}        }
        // return arr;
         int[] arr=new int[seq.length()];
        int k=0;
        int depth=0;
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                arr[k++]=depth%2;
                depth++;
            }
            else{
                depth--;
                arr[k++]=depth%2;
            }
                   }
        return arr;
    }
}