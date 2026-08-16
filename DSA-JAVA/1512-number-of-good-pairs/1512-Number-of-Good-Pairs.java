class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq=new int[101];
        int a=0;
        for(int n:nums){
           a+=freq[n];
           freq[n]++;
        }
        return a;
    }
}