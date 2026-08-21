class Solution {
    public int[] findArray(int[] pref) {
        int[] p=new int[pref.length];
        p[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            p[i]=pref[i-1]^pref[i];
        }
        
        return p;
    }
}