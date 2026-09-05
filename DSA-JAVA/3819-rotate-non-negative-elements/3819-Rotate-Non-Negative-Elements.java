class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        if(nums.length==0)return new int[0];
        for(int n:nums){
            if(n>=0)list.add(n);
        }
    
            Collections.rotate(list,-k);
        
        int g=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)arr[i]=nums[i];
            else arr[i]=list.get(g++);
        }
       return arr;
    }
}