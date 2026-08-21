class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] arr=new int[nums.length];
        int s1=1;
        int s2=1;
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr1[s1-1]>arr2[s2-1])arr1[s1++]=nums[i];
            else arr2[s2++]=nums[i];
        }
        int k=0;
        for(int i=0;i<s1;i++){
            arr[k++]=arr1[i];
        }
        for(int i=0;i<s2;i++){
            arr[k++]=arr2[i];
        }
        return arr;
    }
}