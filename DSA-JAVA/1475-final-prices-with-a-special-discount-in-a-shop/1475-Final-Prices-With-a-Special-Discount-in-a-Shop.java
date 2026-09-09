class Solution {
    public int[] finalPrices(int[] prices) {
       int[] arr=prices.clone();
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<prices.length;i++){
       while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
        int p=st.pop();
        arr[p]=prices[p]-prices[i];

       }
       st.push(i);}
       return arr;
    }
}