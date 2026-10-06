class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v=new boolean[rooms.size()];
        Deque<Integer> q=new LinkedList<>();
        q.add(0);
        v[0]=true;
        while(!q.isEmpty()){
            int r=q.poll();
            for(int e:rooms.get(r)){
                if(!v[e]){q.add(e);v[e]=true;}
            }
        }
        for(int i=0;i<v.length;i++){
            if(v[i]==false)return false;
        }
        return true;
    }
}