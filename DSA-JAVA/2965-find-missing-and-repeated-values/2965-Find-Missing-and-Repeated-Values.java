class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int[2];
        int k=0;
        int t=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] r:grid){
            for(int n:r){map.put(n,map.getOrDefault(n,0)+1);t+=n;}
        }
        for(int i:map.keySet()){
            if(map.get(i)>1)arr[k++]=i;
        }
        int v=grid.length*grid.length;
        int n=v*(v+1)/2;
        arr[k]=arr[0]+(n-t);
        return arr;
    }
}