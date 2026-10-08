class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int r=graph.length;
    List<List<Integer>> rev=new ArrayList<>();
    List<Integer> rev1=new ArrayList<>();
    int[] out=new int[graph.length];
    for(int i=0;i<r;i++){
        rev.add(new ArrayList<>());
    }
    for(int i=0;i<r;i++){
    for(int next:graph[i]){
        rev.get(next).add(i);
        out[i]++;
    }}
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<r;i++){
        if(graph[i].length==0){q.add(i);rev1.add(i);}
    }
    while(!q.isEmpty()){
        int node=q.poll();
        for(int next:rev.get(node)){
             out[next]--;
             if(out[next]==0){q.add(next);rev1.add(next);}
        }

    }
    Collections.sort(rev1);
    return rev1;
    }
}