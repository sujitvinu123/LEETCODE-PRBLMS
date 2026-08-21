class Solution {
    public int[] decompressRLElist(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i+=2)s+=nums[i];
        int[] arr=new int[s];
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            int n=nums[i];
            while(n>0){
                arr[k++]=nums[i+1];n--;
            }

        }
        return arr;
    }
}