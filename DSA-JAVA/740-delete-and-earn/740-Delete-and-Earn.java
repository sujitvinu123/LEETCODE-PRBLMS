class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max=0;
        for(int n:nums){
           max=Math.max(max,n);
        }
        int[] dp=new int[max+1];
        
        dp[0]=0;
        dp[1]=Math.max(dp[0],map.getOrDefault(1,0));
        for(int i=2;i<=max;i++){
            int n=i*map.getOrDefault(i,0);
            dp[i]=Math.max(dp[i-1],n+(dp[i-2]));
        }
        return dp[max];
    }

}