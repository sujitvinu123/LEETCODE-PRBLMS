class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] v=new boolean[n];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v1=e[1];
            graph.get(u).add(v1);
            graph.get(v1).add(u);
        }
        q.add(source);
        v[source]=true;
        while(!q.isEmpty()){
            int n2=q.poll();
            if(n2==destination)return true;
            for(int next:graph.get(n2)){
                if(!v[next]){v[next]=true;q.add(next);}
            }
        }
        return false;
    }
}