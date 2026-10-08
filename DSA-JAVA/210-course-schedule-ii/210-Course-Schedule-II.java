class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] arr=new int[numCourses];
        int c=0;
        int k=0;
        List<List<Integer>> l=new ArrayList<>();
        Deque<Integer> q=new LinkedList<>();
        int[] in=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
            for(int[] n:prerequisites){
                int e=n[0];
                int v=n[1];
                l.get(v).add(e);
                in[e]++;
            }
        
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){q.add(i);arr[k++]=i;}
        }
        while(!q.isEmpty()){
            int node=q.poll();
            
            c++;
            for(int next:l.get(node)){
                in[next]--;
                if(in[next]==0){q.add(next);arr[k++]=next;}
            }
            
        }
        if(c!=numCourses)return new int[0];
        return arr;
    }
}