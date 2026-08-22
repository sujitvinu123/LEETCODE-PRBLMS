class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int s=0;
        int s1=1;
        while(t>0){
            int d=t%10;
            s+=d;
            s1*=d;
            t/=10;
        }
        return n%(s+s1)==0;
    }
}