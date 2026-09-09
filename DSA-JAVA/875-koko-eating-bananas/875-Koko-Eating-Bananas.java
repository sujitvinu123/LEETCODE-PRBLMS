class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int l=1;
        int r=max;
        while(l<r){
            int m=l+(r-l)/2;
            int f=0;
            for(int n:piles){
                f+=(n+m-1)/m;
            }
            if(f>h)l=m+1;
            else r=m;
        }
        return l;
    }
}