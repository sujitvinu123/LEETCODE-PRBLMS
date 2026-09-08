class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        int pt=0;
        for(int i=0;i<logs.size();i++){
            String s=logs.get(i);
            String[] v=s.split(":");
            int fid=Integer.parseInt(v[0]);
            String type=v[1];
            int time=Integer.parseInt(v[2]);
            if(type.equals("start")){
                if(!st.isEmpty()){
                    arr[st.peek()]+=time-pt;
                }
                st.push(fid);
                pt=time;
            }
            else{
                arr[st.peek()]+=time-pt+1;
                st.pop();
                pt=time+1;
            }
            
        }
        return arr;
    }
}