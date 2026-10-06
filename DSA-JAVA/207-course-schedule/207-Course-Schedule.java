class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l=new ArrayList<>();
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        int[] in=new int[numCourses];
        for(int[] e:prerequisites){
            int v1=e[0];
            int v2=e[1];
            l.get(v2).add(v1);
            in[v1]++;
        }
        int c=0;
        for(int i=0;i<numCourses;i++){
            if(in[i]==0)
            q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            c++;
            for(int next:l.get(node)){
                in[next]--;
                if(in[next]==0)q.add(next);
                
            }
           
        }
        return c==numCourses;
    }
}