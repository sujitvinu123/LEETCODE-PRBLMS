class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int temp=n;
            int s=1;
            while(temp>0){
                int d=temp%10;
                s*=d;
                if(s%t==0)return n;
                temp/=10;
            }
            n++;
        }
        
    }
}