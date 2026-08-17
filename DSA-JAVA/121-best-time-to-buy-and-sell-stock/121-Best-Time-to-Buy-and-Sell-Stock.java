class Solution {
    public int maxProfit(int[] prices) {
    
    int s=prices[0];
    int m=0;
    for(int n:prices){
        s=Math.min(s,n);
        m=Math.max(m,n-s);
    }  
    return m;
    }
}
